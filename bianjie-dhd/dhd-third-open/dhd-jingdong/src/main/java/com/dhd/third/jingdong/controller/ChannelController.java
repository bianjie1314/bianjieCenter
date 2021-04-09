package com.dhd.third.jingdong.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.common.response.RespCode;
import com.dhd.common.model.H5RequestModel;
import com.dhd.third.jingdong.controller.base.BaseController;
import com.dhd.third.jingdong.pojo.DhdJdChannel;
import com.dhd.third.jingdong.service.IJdChannelService;
import com.dhd.third.jingdong.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 有关频道信息
 * @author linmingxi
 * 2020/12/24
 */
@RestController
public class ChannelController extends BaseController {

    @Autowired
    IJdChannelService iJdChannelService;


    @GetMapping("/test")
    public String test(){
        return "1";
    }


    @PostMapping("/channel/list")
    public String qryGoodsList(@RequestBody H5RequestModel requestModel){
        try {
            requestModel.getParam().put("status", Constant.CHANNEL_ENABLE);
            List<DhdJdChannel> DhdJdChannelList = iJdChannelService.selectByMap(requestModel.getParam());
            JSONArray jsonArray = new JSONArray();
            if (DhdJdChannelList != null && DhdJdChannelList.size() > 0){
                for (DhdJdChannel item:DhdJdChannelList) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name",item.getChannelName());
                    jsonObject.put("id",item.getSid());
                    jsonArray.add(jsonObject);
                }
            }
            return RespBodyBuilder.toSuccessWithObject(jsonArray);
        }catch (Exception e){
            return RespBodyBuilder.toError(RespCode.CODE_10501);
        }
    }


}
