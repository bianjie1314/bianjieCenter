package com.bianjie.orm.mapper;

import com.bianjie.orm.pojo.PhonePackage;
import com.bianjie.orm.pojo.PhonePackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhonePackageMapper {
    int countByExample(PhonePackageExample example);

    int deleteByExample(PhonePackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PhonePackage record);

    int insertSelective(PhonePackage record);

    List<PhonePackage> selectByExample(PhonePackageExample example);

    PhonePackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PhonePackage record, @Param("example") PhonePackageExample example);

    int updateByExample(@Param("record") PhonePackage record, @Param("example") PhonePackageExample example);

    int updateByPrimaryKeySelective(PhonePackage record);

    int updateByPrimaryKey(PhonePackage record);
}