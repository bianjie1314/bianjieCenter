package com.dhd.third.taobao.mapper;

import com.dhd.third.taobao.pojo.DhdTbKeyPlatform;
import com.dhd.third.taobao.pojo.DhdTbKeyPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdTbKeyPlatformMapper {
    int countByExample(DhdTbKeyPlatformExample example);

    int deleteByExample(DhdTbKeyPlatformExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdTbKeyPlatform record);

    int insertSelective(DhdTbKeyPlatform record);

    List<DhdTbKeyPlatform> selectByExample(DhdTbKeyPlatformExample example);

    DhdTbKeyPlatform selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdTbKeyPlatform record, @Param("example") DhdTbKeyPlatformExample example);

    int updateByExample(@Param("record") DhdTbKeyPlatform record, @Param("example") DhdTbKeyPlatformExample example);

    int updateByPrimaryKeySelective(DhdTbKeyPlatform record);

    int updateByPrimaryKey(DhdTbKeyPlatform record);
}