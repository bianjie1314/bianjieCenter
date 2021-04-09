package com.dhd.third.jingdong.mapper;

import com.dhd.third.jingdong.pojo.DhdJdKeyPlatformPromotion;
import com.dhd.third.jingdong.pojo.DhdJdKeyPlatformPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdJdKeyPlatformPromotionMapper {
    int countByExample(DhdJdKeyPlatformPromotionExample example);

    int deleteByExample(DhdJdKeyPlatformPromotionExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdJdKeyPlatformPromotion record);

    int insertSelective(DhdJdKeyPlatformPromotion record);

    List<DhdJdKeyPlatformPromotion> selectByExample(DhdJdKeyPlatformPromotionExample example);

    DhdJdKeyPlatformPromotion selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdJdKeyPlatformPromotion record, @Param("example") DhdJdKeyPlatformPromotionExample example);

    int updateByExample(@Param("record") DhdJdKeyPlatformPromotion record, @Param("example") DhdJdKeyPlatformPromotionExample example);

    int updateByPrimaryKeySelective(DhdJdKeyPlatformPromotion record);

    int updateByPrimaryKey(DhdJdKeyPlatformPromotion record);
}