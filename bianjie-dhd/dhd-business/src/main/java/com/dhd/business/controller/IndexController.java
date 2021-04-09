package com.dhd.business.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.common.response.RespCode;
import com.dhd.business.controller.base.BaseController;
import com.dhd.business.pojo.DhdCustomerMenu;
import com.dhd.business.service.IDhdCustomerMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/22
 */
@RestController("/index")
public class IndexController extends BaseController {

    @Autowired
    IDhdCustomerMenuService dhdCustomerMenuService;


    @PostMapping("/channelList")
    public String channelList(@RequestBody Map param){
        try {
            if (!param.containsKey("platform")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }
            param.put("status",1);
            List<DhdCustomerMenu> dhdCustomerMenuList = dhdCustomerMenuService.selectByMap(param);
            JSONArray jsonArray = new JSONArray();
            if (dhdCustomerMenuList != null && dhdCustomerMenuList.size()>0){
                for (DhdCustomerMenu item:dhdCustomerMenuList) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name",item.getName());
                    jsonObject.put("iconUrl",item.getIconUrl());
                    jsonObject.put("targetUrl",item.getTargetUrl());
                    jsonObject.put("type",item.getType());
                    jsonArray.add(jsonObject);
                }
            }
            return RespBodyBuilder.toSuccessWithObject(jsonArray);
        }catch (Exception e){
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }


    @PostMapping("/categoryList")
    public String categoryList(@RequestBody Map param){
        try {
            if (!param.containsKey("platform")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }
            param.put("status",1);
            List<DhdCustomerMenu> dhdCustomerMenuList = dhdCustomerMenuService.selectByMap(param);
            JSONArray jsonArray = new JSONArray();
            if (dhdCustomerMenuList != null && dhdCustomerMenuList.size()>0){
                for (DhdCustomerMenu item:dhdCustomerMenuList) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name",item.getName());
                    jsonObject.put("code",item.getIconUrl());
                    jsonArray.add(jsonObject);
                }
            }
            return RespBodyBuilder.toSuccessWithObject(jsonArray);
        }catch (Exception e){
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }

}
