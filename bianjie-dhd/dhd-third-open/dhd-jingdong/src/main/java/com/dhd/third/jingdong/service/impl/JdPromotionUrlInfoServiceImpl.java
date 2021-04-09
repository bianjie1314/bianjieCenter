package com.dhd.third.jingdong.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bianjie.common.response.RespBody;
import com.bianjie.common.response.RespCode;
import com.dhd.common.model.H5RequestModel;
import com.dhd.third.jingdong.mapper.DhdJdPromotionUrlInfoMapper;
import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfo;
import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfoExample;
import com.dhd.third.jingdong.service.IJdPromotionUrlInfoService;
import com.dhd.third.jingdong.service.IJdUnionApiService;
import com.jd.open.api.sdk.domain.kplunion.promotioncommon.PromotionService.response.get.PromotionCodeResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/03
 */
@Service
public class JdPromotionUrlInfoServiceImpl implements IJdPromotionUrlInfoService {

    @Autowired
    DhdJdPromotionUrlInfoMapper dhdJdPromotionUrlInfoMapper;
    @Autowired
    IJdUnionApiService iJdUnionApiService;


    @Override
    public DhdJdPromotionUrlInfo selectByPrimaryKey(Integer sid) {
        return dhdJdPromotionUrlInfoMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int insertSelective(DhdJdPromotionUrlInfo record) {
        return dhdJdPromotionUrlInfoMapper.insertSelective(record);
    }

    @Override
    public List<DhdJdPromotionUrlInfo> selectByExample(DhdJdPromotionUrlInfoExample example) {
        return dhdJdPromotionUrlInfoMapper.selectByExample(example);
    }

    @Override
    public RespBody promotionCommonGet(H5RequestModel requestModel) {
        DhdJdPromotionUrlInfoExample example = new DhdJdPromotionUrlInfoExample();
        DhdJdPromotionUrlInfoExample.Criteria criteria = example.createCriteria();
        Map param = requestModel.getParam();
        if (param.containsKey("materialId")){
            criteria.andMaterialIdEqualTo((String) param.get("materialId"));
        }
        if (param.containsKey("siteId")){
            criteria.andSiteIdEqualTo((String) param.get("siteId"));
        }
        if (param.containsKey("couponUrl")){
            criteria.andCouponUrlEqualTo((String) param.get("couponUrl"));
        }
        if (param.containsKey("positionId")){
            criteria.andPositionIdEqualTo((Long) param.get("positionId"));
        }
        List<DhdJdPromotionUrlInfo> dhdJdPromotionUrlInfoList = this.selectByExample(example);
        if (dhdJdPromotionUrlInfoList != null && dhdJdPromotionUrlInfoList.size() > 0){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("clickUrl",dhdJdPromotionUrlInfoList.get(0).getClickUrl());
            return new RespBody(jsonObject);
        }
        RespBody respBody = iJdUnionApiService.promotionCommonGet(null, param);
        if (respBody.getCode() == RespCode.CODE_200.getCode()){
            //保存
            PromotionCodeResp data = (PromotionCodeResp)respBody.getData();
            DhdJdPromotionUrlInfo dhdJdPromotionUrlInfo = new DhdJdPromotionUrlInfo();
            dhdJdPromotionUrlInfo.setMaterialId((String) param.get("materialId"));
            if (param.containsKey("couponUrl")){
                dhdJdPromotionUrlInfo.setCouponUrl((String) param.get("couponUrl"));
            }
            if (param.containsKey("positionId")){
                dhdJdPromotionUrlInfo.setPositionId((Long) param.get("positionId"));
            }
            dhdJdPromotionUrlInfo.setClickUrl(data.getClickURL());
            dhdJdPromotionUrlInfoMapper.insertSelective(dhdJdPromotionUrlInfo);
        }
        return respBody;
    }


}
