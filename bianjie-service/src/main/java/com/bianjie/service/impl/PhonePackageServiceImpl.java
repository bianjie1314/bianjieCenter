package com.bianjie.service.impl;

import com.bianjie.orm.mapper.PhonePackageMapper;
import com.bianjie.orm.pojo.PhonePackage;
import com.bianjie.orm.pojo.PhonePackageExample;
import com.bianjie.service.IPhonePackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhonePackageServiceImpl implements IPhonePackageService {

    @Autowired
    PhonePackageMapper phonePackageMapper;

    @Override
    public int countByExample(PhonePackageExample example) {
        return phonePackageMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PhonePackageExample example) {
        return phonePackageMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return phonePackageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PhonePackage record) {
        return phonePackageMapper.insert(record);
    }

    @Override
    public int insertSelective(PhonePackage record) {
        return phonePackageMapper.insertSelective(record);
    }

    @Override
    public List<PhonePackage> selectByExample(PhonePackageExample example) {
        return phonePackageMapper.selectByExample(example);
    }

    @Override
    public PhonePackage selectByPrimaryKey(Integer id) {
        return phonePackageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(PhonePackage record, PhonePackageExample example) {
        return phonePackageMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(PhonePackage record, PhonePackageExample example) {
        return phonePackageMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(PhonePackage record) {
        return phonePackageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PhonePackage record) {
        return phonePackageMapper.updateByPrimaryKey(record);
    }
}