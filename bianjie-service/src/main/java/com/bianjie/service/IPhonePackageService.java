package com.bianjie.service;

import com.bianjie.orm.pojo.PhonePackage;
import com.bianjie.orm.pojo.PhonePackageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPhonePackageService {
    int countByExample(PhonePackageExample example);

    int deleteByExample(PhonePackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhonePackage record);

    int insertSelective(PhonePackage record);

    List<PhonePackage> selectByExample(PhonePackageExample example);

    PhonePackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(PhonePackage record, PhonePackageExample example);

    int updateByExample(PhonePackage record, PhonePackageExample example);

    int updateByPrimaryKeySelective(PhonePackage record);

    int updateByPrimaryKey(PhonePackage record);
}