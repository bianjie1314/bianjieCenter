package com.dhd.third.jingdong.gateway.filter;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;
import java.nio.charset.StandardCharsets;

@Order(1)
@Component
@WebFilter(filterName = "webLogFilter", urlPatterns = "/*")
public class WebLogFilter implements Filter {
    private final static Logger logger = LoggerFactory.getLogger(WebLogFilter.class);
    private ThreadLocal threadLocal = new ThreadLocal<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 包装request和response
        RequestWrapper requestWrapper = new RequestWrapper((HttpServletRequest) request);
        ResponseWrapper responseWrapper = new ResponseWrapper((HttpServletResponse) response);
        // 获取request的相关数据
        logger.info("请求ip={},URL={}",request.getRemoteAddr(),requestWrapper.getRequestURL().toString());
        logger.info("请求参数:{}",requestWrapper.getBody());
        threadLocal.set(System.currentTimeMillis());
        chain.doFilter(requestWrapper, responseWrapper);
        // 获取response的相关数据
        logger.info("响应数据:{}" ,new String(responseWrapper.getContent(), "UTF-8"));
        logger.info("处理时间:{}ms" ,(System.currentTimeMillis() - (Long) threadLocal.get()));
        // 在得到响应的数据之后，response的输出流中就无可用的数据，所以需要巴数据放回去
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(responseWrapper.getContent());
        outputStream.flush();
        outputStream.close();
    }

    @Override
    public void destroy() {
    }
}

class RequestWrapper extends HttpServletRequestWrapper {
    private String body;

    public RequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        // 此处是得到请求内容的长度
        int contentLength = request.getContentLength();
        if (contentLength > 0){

            StringBuilder stringBuilder = new StringBuilder(contentLength);
            BufferedReader bufferedReader = null;
            InputStream inputStream = null;
            try {
                // 输入流获取请求的数据
                inputStream = request.getInputStream();
                if (inputStream != null) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    char[] charBuffer = new char[1024];
                    int bytesRead;
                    while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                        stringBuilder.append(charBuffer, 0, bytesRead);
                    }
                }
            } catch (IOException e) {
                throw e;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            }
            // 下面会把数据放回request的输入流中，所以要把数据恢复到与之前请求内容相同的长度
            body = String.format("%-" + contentLength + "s", JSONObject.parseObject(stringBuilder.toString()));
        }
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
        // 数据放到字节流中
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.getBody().getBytes());
        return new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener listener) {
            }

            @Override
            public int read() throws IOException {
                // 数据放回request的输入流中
                return byteArrayInputStream.read();
            }
        };
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(this.getInputStream()));
    }

    public String getBody() {
        // 请求中的数据
        return this.body;
    }
}

class ResponseWrapper extends HttpServletResponseWrapper {
    private ByteArrayOutputStream byteArrayOutputStream;
    private ServletOutputStream servletOutputStream;

    public ResponseWrapper(HttpServletResponse response) throws IOException {
        super(response);
        byteArrayOutputStream = new ByteArrayOutputStream();
        servletOutputStream = new MyServletOutputStream(byteArrayOutputStream);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        return servletOutputStream;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
    }

    @Override
    public void flushBuffer() {
        if (servletOutputStream != null) {
            try {
                servletOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public byte[] getContent() {
        flushBuffer();
        // response中的数据
        return byteArrayOutputStream.toByteArray();
    }

    class MyServletOutputStream extends ServletOutputStream {
        // 把response输出流中的数据写入字节流中
        private ByteArrayOutputStream byteArrayOutputStream;

        public MyServletOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
        }

        @Override
        public boolean isReady() {
            return false;
        }

        @Override
        public void setWriteListener(WriteListener listener) {
        }

        @Override
        public void write(int b) throws IOException {
            byteArrayOutputStream.write(b);
        }
    }
}