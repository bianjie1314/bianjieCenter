package com.bianjie.orm.mapper;

import com.bianjie.orm.pojo.PhoneInfo;
import com.bianjie.orm.pojo.PhoneInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneInfoMapper {
    int countByExample(PhoneInfoExample example);

    int deleteByExample(PhoneInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhoneInfo record);

    int insertSelective(PhoneInfo record);

    List<PhoneInfo> selectByExample(PhoneInfoExample example);

    PhoneInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PhoneInfo record, @Param("example") PhoneInfoExample example);

    int updateByExample(@Param("record") PhoneInfo record, @Param("example") PhoneInfoExample example);

    int updateByPrimaryKeySelective(PhoneInfo record);

    int updateByPrimaryKey(PhoneInfo record);
}