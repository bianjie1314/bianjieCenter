package com.bianjie.phone.interceptor;

import com.bianjie.orm.pojo.RequestRouterLog;
import com.bianjie.service.IRequestRouterLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author linmingxi
 * 2020/05/24
 */
@Configuration
public class WebIntercepter extends HandlerInterceptorAdapter {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    IRequestRouterLogService requestRouterLogService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("请求地址:{}",request.getRemoteAddr());
        RequestRouterLog requestRouterLog = new RequestRouterLog();
        requestRouterLog.setCreateTime(new Date());
        requestRouterLog.setRequestIp(request.getRemoteAddr());
        requestRouterLog.setServerPath(request.getServletPath());
        requestRouterLog.setServerName(request.getServerName());
        requestRouterLogService.insertSelective(requestRouterLog);
        return super.preHandle(request, response, handler);
    }
}
