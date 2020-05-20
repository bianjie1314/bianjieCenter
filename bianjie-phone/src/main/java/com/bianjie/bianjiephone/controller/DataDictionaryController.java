package com.bianjie.bianjiephone.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bianjie.bianjiephone.controller.Base.BaseController;
import com.bianjie.common.response.RespBodyBuilder;
import com.bianjie.orm.pojo.DataDictionary;
import com.bianjie.orm.pojo.DataDictionaryExample;
import com.bianjie.service.IDataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linmingxi
 * 2020/05/19
 **/
@RequestMapping("/dataDictionary")
@RestController
public class DataDictionaryController extends BaseController {

    @Autowired
    IDataDictionaryService dataDictionaryService;

    @RequestMapping("/byPCode/{code}")
    public String qryPhoneList(@PathVariable("code") String code){
        logger.info("byPCode -- code:{}",JSONObject.toJSONString(code));
        JSONArray jsonArray = new JSONArray();
        try{
            DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
            DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
            criteria.andFlagCodeEqualTo(code);
            List<DataDictionary> dataDictionaryList = dataDictionaryService.selectByExample(dataDictionaryExample);

            if (dataDictionaryList != null && dataDictionaryList.size() == 1 ){
                dataDictionaryExample.clear();
                DataDictionaryExample.Criteria criteria2 = dataDictionaryExample.createCriteria();
                criteria2.andPareantIdEqualTo(dataDictionaryList.get(0).getId());
                List<DataDictionary> dataDictionaryList2 = dataDictionaryService.selectByExample(dataDictionaryExample);
                for (DataDictionary item:dataDictionaryList2) {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("name",item.getName());
                    jsonObject.put("v1",item.getValue1());
                    jsonObject.put("v2",item.getValue2());
                    jsonArray.add(jsonObject);
                }
            }
        }catch (Exception e){
            logger.info("byPCode -- error:{}",e.getMessage());
        }
        logger.info("byPCode -- reply:{}",jsonArray);
        return RespBodyBuilder.toSuccessWithObject(jsonArray);
    }



}
