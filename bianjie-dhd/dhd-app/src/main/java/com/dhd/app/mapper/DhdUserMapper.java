package com.dhd.app.mapper;

import java.util.List;

import com.dhd.app.pojo.DhdUser;
import com.dhd.app.pojo.DhdUserExample;
import org.apache.ibatis.annotations.Param;

public interface DhdUserMapper {
    int countByExample(DhdUserExample example);

    int deleteByExample(DhdUserExample example);

    int deleteByPrimaryKey(String telephone);

    int insert(DhdUser record);

    int insertSelective(DhdUser record);

    List<DhdUser> selectByExample(DhdUserExample example);

    DhdUser selectByPrimaryKey(String telephone);

    int updateByExampleSelective(@Param("record") DhdUser record, @Param("example") DhdUserExample example);

    int updateByExample(@Param("record") DhdUser record, @Param("example") DhdUserExample example);

    int updateByPrimaryKeySelective(DhdUser record);

    int updateByPrimaryKey(DhdUser record);
}