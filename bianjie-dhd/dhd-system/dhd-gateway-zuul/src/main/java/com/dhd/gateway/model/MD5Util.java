package com.dhd.gateway.model;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by liping on 2018-08-10.
 */
public class MD5Util {

    public static String md5(String content) throws Exception {
        StringBuffer sb = new StringBuffer();
        try{
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(content.getBytes("UTF-8"));
            byte[] tmpFolder = md5.digest();

            for (byte aTmpFolder : tmpFolder) {
                sb.append(Integer.toString((aTmpFolder & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        }catch(NoSuchAlgorithmException ex){
            throw new Exception("无法生成指定内容的MD5签名", ex);
        }catch(UnsupportedEncodingException ex){
            throw new Exception("无法生成指定内容的MD5签名", ex);
        }
    }

}