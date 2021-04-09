package com.dhd.third.jingdong.service;

import com.bianjie.common.response.RespBody;
import com.dhd.common.model.H5RequestModel;
import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfo;
import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfoExample;

import java.util.List;

/**
 * @author linmingxi
 * 2021/01/03
 */
public interface IJdPromotionUrlInfoService {

    DhdJdPromotionUrlInfo selectByPrimaryKey(Integer sid);

    int insertSelective(DhdJdPromotionUrlInfo record);

    List<DhdJdPromotionUrlInfo> selectByExample(DhdJdPromotionUrlInfoExample example);

    RespBody promotionCommonGet(H5RequestModel requestModel);

}
