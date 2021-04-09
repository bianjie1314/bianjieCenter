package com.dhd.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespCode;
import com.dhd.app.controller.base.BaseController;
import com.dhd.app.pojo.DhdUser;
import com.dhd.app.service.UserService;
import com.dhd.common.model.AppRequestModel;
import com.dhd.common.model.AppResponseModel;
import com.dhd.common.utils.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmingxi
 * 2021/02/01
 */
@RestController
public class LoginController extends BaseController {

    @Autowired
    UserService userService;


    @PostMapping("/login")
    @ResponseBody
    public AppResponseModel appLogin(@RequestBody AppRequestModel appRequestModel){
        //TODO 密码加密
        DhdUser dhdUser = userService.selectByPrimaryKey((String) appRequestModel.getParam().get("telephone"));
        if (dhdUser == null){
            return AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(RespCode.CODE_10507));
        }
        if (UserStatus.NORMAL.getKey().equals(dhdUser.getStatus())){
            return AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(RespCode.CODE_10508));
        }
        //TODO 同步到redis中,返回缓存key
        StringBuffer keyBuffer = new StringBuffer();
        keyBuffer.append(dhdUser.getTelephone());
        keyBuffer.append(System.currentTimeMillis());

        JSONObject resultJson = new JSONObject();
        resultJson.put("telephone",dhdUser.getTelephone());
        resultJson.put("session",keyBuffer.toString());
        return AppResponseModel.getInstance(appRequestModel.getTid(),new RespBody(resultJson));
    }

}
