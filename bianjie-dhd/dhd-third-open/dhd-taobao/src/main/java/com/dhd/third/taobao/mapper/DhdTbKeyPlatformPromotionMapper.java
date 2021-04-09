package com.dhd.third.taobao.mapper;

import com.dhd.third.taobao.pojo.DhdTbKeyPlatformPromotion;
import com.dhd.third.taobao.pojo.DhdTbKeyPlatformPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdTbKeyPlatformPromotionMapper {
    int countByExample(DhdTbKeyPlatformPromotionExample example);

    int deleteByExample(DhdTbKeyPlatformPromotionExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdTbKeyPlatformPromotion record);

    int insertSelective(DhdTbKeyPlatformPromotion record);

    List<DhdTbKeyPlatformPromotion> selectByExample(DhdTbKeyPlatformPromotionExample example);

    DhdTbKeyPlatformPromotion selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdTbKeyPlatformPromotion record, @Param("example") DhdTbKeyPlatformPromotionExample example);

    int updateByExample(@Param("record") DhdTbKeyPlatformPromotion record, @Param("example") DhdTbKeyPlatformPromotionExample example);

    int updateByPrimaryKeySelective(DhdTbKeyPlatformPromotion record);

    int updateByPrimaryKey(DhdTbKeyPlatformPromotion record);
}