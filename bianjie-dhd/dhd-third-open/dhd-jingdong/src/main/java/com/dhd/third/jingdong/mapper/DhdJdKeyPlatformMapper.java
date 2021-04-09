package com.dhd.third.jingdong.mapper;

import com.dhd.third.jingdong.pojo.DhdJdKeyPlatform;
import com.dhd.third.jingdong.pojo.DhdJdKeyPlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdJdKeyPlatformMapper {
    int countByExample(DhdJdKeyPlatformExample example);

    int deleteByExample(DhdJdKeyPlatformExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdJdKeyPlatform record);

    int insertSelective(DhdJdKeyPlatform record);

    List<DhdJdKeyPlatform> selectByExample(DhdJdKeyPlatformExample example);

    DhdJdKeyPlatform selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdJdKeyPlatform record, @Param("example") DhdJdKeyPlatformExample example);

    int updateByExample(@Param("record") DhdJdKeyPlatform record, @Param("example") DhdJdKeyPlatformExample example);

    int updateByPrimaryKeySelective(DhdJdKeyPlatform record);

    int updateByPrimaryKey(DhdJdKeyPlatform record);
}