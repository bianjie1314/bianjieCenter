package com.bianjie.service.impl;

import com.bianjie.orm.mapper.PhoneInfoMapper;
import com.bianjie.orm.pojo.PhoneInfo;
import com.bianjie.orm.pojo.PhoneInfoExample;
import com.bianjie.service.IPhoneInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/05/19
 **/
@Service
public class PhonInfoServiceImpl implements IPhoneInfoService {

    @Autowired
    PhoneInfoMapper phoneInfoMapper;


    @Override
    public int countByExample(PhoneInfoExample example) {
        return phoneInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PhoneInfoExample example) {
        return phoneInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return phoneInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PhoneInfo record) {
        return phoneInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PhoneInfo record) {
        return phoneInfoMapper.insertSelective(record);
    }

    @Override
    public List<PhoneInfo> selectByExample(PhoneInfoExample example) {
        return phoneInfoMapper.selectByExample(example);
    }

    @Override
    public PhoneInfo selectByPrimaryKey(Integer id) {
        return phoneInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(PhoneInfo record, PhoneInfoExample example) {
        return phoneInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(PhoneInfo record, PhoneInfoExample example) {
        return phoneInfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(PhoneInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(PhoneInfo record) {
        return 0;
    }

    @Override
    public List<PhoneInfo> selectByMap(Map map) {
        return phoneInfoMapper.selectByExample(initQryParam(map,true));
    }


    @Override
    public long countByMap(Map map) {
        return phoneInfoMapper.countByExample(initQryParam(map,false));
    }

    private PhoneInfoExample initQryParam(Map map,boolean initPage){
        PhoneInfoExample example = new PhoneInfoExample();
        PhoneInfoExample.Criteria criteria = example.createCriteria();
        if (initPage && map.containsKey("status") && map.get("status") != null){
            criteria.andStatusEqualTo((Integer)map.get("status"));
        }
        if (map.containsKey("currentIndex") && map.containsKey("pageSize")){
            PageHelper.startPage((Integer) map.get("currentIndex"),(Integer) map.get("pageSize"));
        }
        return example;
    }
}
