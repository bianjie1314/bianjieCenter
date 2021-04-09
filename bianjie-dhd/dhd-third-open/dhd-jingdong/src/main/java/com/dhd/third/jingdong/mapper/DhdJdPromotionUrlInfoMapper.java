package com.dhd.third.jingdong.mapper;

import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfo;
import com.dhd.third.jingdong.pojo.DhdJdPromotionUrlInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdJdPromotionUrlInfoMapper {
    int countByExample(DhdJdPromotionUrlInfoExample example);

    int deleteByExample(DhdJdPromotionUrlInfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdJdPromotionUrlInfo record);

    int insertSelective(DhdJdPromotionUrlInfo record);

    List<DhdJdPromotionUrlInfo> selectByExample(DhdJdPromotionUrlInfoExample example);

    DhdJdPromotionUrlInfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdJdPromotionUrlInfo record, @Param("example") DhdJdPromotionUrlInfoExample example);

    int updateByExample(@Param("record") DhdJdPromotionUrlInfo record, @Param("example") DhdJdPromotionUrlInfoExample example);

    int updateByPrimaryKeySelective(DhdJdPromotionUrlInfo record);

    int updateByPrimaryKey(DhdJdPromotionUrlInfo record);
}