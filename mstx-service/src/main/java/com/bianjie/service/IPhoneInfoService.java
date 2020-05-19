package com.bianjie.service;

import com.bianjie.orm.pojo.PhoneInfo;
import com.bianjie.orm.pojo.PhoneInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/05/19
 **/
public interface IPhoneInfoService {
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

    List<PhoneInfo> selectByMap(Map map);
    long countByMap(Map map);

}
