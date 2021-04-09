package com.dhd.business.mapper;

import com.dhd.business.pojo.DhdCustomerMenu;
import com.dhd.business.pojo.DhdCustomerMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdCustomerMenuMapper {
    int countByExample(DhdCustomerMenuExample example);

    int deleteByExample(DhdCustomerMenuExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdCustomerMenu record);

    int insertSelective(DhdCustomerMenu record);

    List<DhdCustomerMenu> selectByExample(DhdCustomerMenuExample example);

    DhdCustomerMenu selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdCustomerMenu record, @Param("example") DhdCustomerMenuExample example);

    int updateByExample(@Param("record") DhdCustomerMenu record, @Param("example") DhdCustomerMenuExample example);

    int updateByPrimaryKeySelective(DhdCustomerMenu record);

    int updateByPrimaryKey(DhdCustomerMenu record);
}