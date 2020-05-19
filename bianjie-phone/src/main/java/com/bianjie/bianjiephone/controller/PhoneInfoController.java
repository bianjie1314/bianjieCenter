package com.bianjie.bianjiephone.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.bianjiephone.controller.Base.BaseController;
import com.bianjie.common.enums.MnoType;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.orm.pojo.PhoneInfo;
import com.bianjie.service.IPhoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/05/19
 **/
@RequestMapping("/phoneInfo")
@RestController
public class PhoneInfoController extends BaseController {

    @Autowired
    IPhoneInfoService iPhoneInfoService;

    @RequestMapping("/list")
    public String qryPhoneList(Map map){
        logger.info("list -- param:{}",map.toString());
        JSONArray jsonArray = new JSONArray();
        try{
            long count = iPhoneInfoService.countByMap(map);
            if (count > 0){
                List<PhoneInfo> phoneInfoList = iPhoneInfoService.selectByMap(map);
                for (PhoneInfo info:phoneInfoList){
                    JSONObject itemJson = new JSONObject();
                    itemJson.put("phoneNumber",info.getPhoneNumber());
                    itemJson.put("mno", MnoType.getValue(info.getMno()));
                    itemJson.put("prostoreMoney", Double.parseDouble(info.getBossPrestore())/100);
                    itemJson.put("provinceName", info.getProvinceName());
                    itemJson.put("cityName", info.getCityName());
                    jsonArray.add(itemJson);
                }
            }
        }catch (Exception e){
            logger.info("list -- error:{}",e.getMessage());
        }
        logger.info("list -- reply:{}",jsonArray);
        return RespBodyBuilder.toSuccessWithObject(jsonArray);
    }



}
