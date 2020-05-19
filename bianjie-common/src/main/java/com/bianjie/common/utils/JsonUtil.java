package com.bianjie.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Random;

/**
 * Json格式处理类
 */
public class JsonUtil {

    /**
     * 将Object对象转换成Json
     *
     * @param object Object对象
     * @return Json字符串
     */
    public static String convertObject2Json(Object object) {
        return JSONObject.toJSONString(object);
    }

    /**
     * 将Json转换成Object对象
     *
     * @param json Json字符串
     * @param cls  转换成的对象类型
     * @return 转换之后的对象
     */
    public static <T> T convertJson2Object(String json, Class<T> cls) {
        return JSONObject.parseObject(json, cls);
    }

    public static JSONObject parsePostBody(String body) {
        JSONObject result = null;
        if (body != null && body.trim().length() > 0) {
            result = new JSONObject();
            if (body.trim().indexOf("&") > 0) {
                String[] paras = body.trim().split("&");
                for (String p : paras) {
                    String[] ps = p.split("=");
                    result.put(ps[0].toString(), ps[1].toString());
                }
            } else {
                String[] paras = body.trim().split("=");
                result.put(paras[0].toString(), paras[1].toString());
            }
        }
        return result;
    }

    public static String generateRandomCode(int digit) {
        String code = String.valueOf(new Random().nextInt(10));
        switch (digit) {
            case 2:
                code = String.valueOf(new Random().nextInt(89) + 10);
                break;
            case 4:
                code = String.valueOf(new Random().nextInt(8999) + 1000);
                break;
            case 6:
                code = String.valueOf(new Random().nextInt(899999) + 100000);
                break;
            case 8:
                code = String.valueOf(new Random().nextInt(89999999) + 10000000);
                break;
            default:
                break;
        }
        return code;
    }

    public static String getServiceID() {
        return System.currentTimeMillis() + generateRandomCode(2);
    }

    public static String getServiceIDBySef(int digit) {
        return System.currentTimeMillis() + generateRandomCode(digit);
    }

    /**
     * 截取身份证后8位
     *
     * @param card
     * @throws Exception
     */
    public static String subAfter8OfCard(String card) {
        return card.substring(card.length() - 8, card.length());
    }


}
