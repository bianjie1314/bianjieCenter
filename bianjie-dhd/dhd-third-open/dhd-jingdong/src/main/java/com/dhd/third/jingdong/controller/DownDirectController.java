package com.dhd.third.jingdong.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.common.response.RespCode;
import com.dhd.common.model.H5RequestModel;
import com.dhd.third.jingdong.controller.base.BaseController;
import com.dhd.third.jingdong.pojo.DhdJdDownDirect;
import com.dhd.third.jingdong.service.IJdDownDirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 京东链接直接下载
 * @author linmingxi
 * 2020/12/20
 */
@RestController
public class DownDirectController extends BaseController {

    @Autowired
    IJdDownDirectService jdDownDirectService;

    @PostMapping("/downDirect/list")
    public String qryGoodsList(@RequestBody H5RequestModel requestModel){
        try {
            List<DhdJdDownDirect> dhdJdDownDirectList = jdDownDirectService.selectByMap(requestModel.getParam());
            JSONArray jsonArray = new JSONArray();
            if (dhdJdDownDirectList != null && dhdJdDownDirectList.size() > 0){
                for (DhdJdDownDirect item:dhdJdDownDirectList) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name",item.getName());
                    jsonObject.put("picUrl",item.getIndexPicUrl());
                    jsonObject.put("couponUrl",item.getCouponUrl());
                    jsonObject.put("detailUrl",item.getDetailUrl());
                    jsonObject.put("beforePrice",item.getBeforePrice());
                    jsonObject.put("afterPrice",item.getAfterPrice());
                    jsonArray.add(jsonObject);
                }
            }
            return RespBodyBuilder.toSuccessWithObject(jsonArray);
        }catch (Exception e){
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }

}
