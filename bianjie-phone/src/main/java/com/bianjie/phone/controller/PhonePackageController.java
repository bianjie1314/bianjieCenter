package com.bianjie.phone.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.enums.PhonePackageStatus;
import com.bianjie.phone.controller.Base.BaseController;
import com.bianjie.common.PageRequest;
import com.bianjie.common.PageResult;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.common.response.RespCode;
import com.bianjie.orm.pojo.PhoneInfo;
import com.bianjie.orm.pojo.PhoneInfoExample;
import com.bianjie.orm.pojo.PhonePackage;
import com.bianjie.orm.pojo.PhonePackageExample;
import com.bianjie.service.IPhoneInfoService;
import com.bianjie.service.IPhonePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/05/23
 **/
@RequestMapping("/packageInfo")
@RestController
public class PhonePackageController extends BaseController {

    @Autowired
    IPhoneInfoService iPhoneInfoService;
    @Autowired
    IPhonePackageService iPhonePackageService;

    @RequestMapping("/phonePackageList")
    public String qryPhoneList(@RequestBody PageRequest pageParam){
        logger.info("phonePackageList -- param:{}",JSONObject.toJSONString(pageParam));
        JSONArray jsonArray = new JSONArray();
        try{
            Map paramContent = pageParam.getParam();
            if (!paramContent.containsKey("phoneNumber")){
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }

            PhoneInfoExample phoneInfoExample = new PhoneInfoExample();
            PhoneInfoExample.Criteria criteria = phoneInfoExample.createCriteria();
            criteria.andPhoneNumberEqualTo((String)paramContent.get("phoneNumber"));
            List<PhoneInfo> phoneInfoList = iPhoneInfoService.selectByExample(phoneInfoExample);
            if (phoneInfoList == null ||phoneInfoList.size() != 1){
                logger.info("号码信息不存在,phoneNumber={}",(String)paramContent.get("phoneNumber"));
                return RespBodyBuilder.toError(RespCode.CODE_10502);
            }

            PhonePackageExample phonePackageExample = new PhonePackageExample();
            phonePackageExample.setOrderByClause("low_fee asc");
            PhonePackageExample.Criteria criteria1 = phonePackageExample.createCriteria();
            criteria1.andLowFeeGreaterThanOrEqualTo(Integer.parseInt(phoneInfoList.get(0).getMinConsumer()))
            .andMnoEqualTo(phoneInfoList.get(0).getMno()).andStatusEqualTo(PhonePackageStatus.ENABLE_1.getKey());
            List<PhonePackage> phonePackageList = iPhonePackageService.selectByExample(phonePackageExample);
            for (PhonePackage info:phonePackageList){
                JSONObject itemJson = new JSONObject();
                itemJson.put("name",info.getName());
                itemJson.put("desc",info.getServiceDesc());
                jsonArray.add(itemJson);
            }
        }catch (Exception e){
            logger.info("phonePackageList -- error:{}",e.getMessage());
        }
        logger.info("phonePackageList -- reply:{}",jsonArray);
        return RespBodyBuilder.toSuccessWithObject(new PageResult<JSONArray>(jsonArray,pageParam));
    }



}
