package com.bianjie.service.impl;

import com.bianjie.orm.mapper.DataDictionaryMapper;
import com.bianjie.orm.pojo.DataDictionary;
import com.bianjie.orm.pojo.DataDictionaryExample;
import com.bianjie.service.IDataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linmingxi
 * 2020/05/20
 **/
@Service
public class DataDictionaryServiceImpl implements IDataDictionaryService {

    @Autowired
    DataDictionaryMapper dataDictionaryMapper;

    @Override
    public int countByExample(DataDictionaryExample example) {
        return dataDictionaryMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DataDictionaryExample example) {
        return dataDictionaryMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dataDictionaryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DataDictionary record) {
        return dataDictionaryMapper.insert(record);
    }

    @Override
    public int insertSelective(DataDictionary record) {
        return dataDictionaryMapper.insertSelective(record);
    }

    @Override
    public List<DataDictionary> selectByExample(DataDictionaryExample example) {
        return dataDictionaryMapper.selectByExample(example);
    }

    @Override
    public DataDictionary selectByPrimaryKey(Integer id) {
        return dataDictionaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(DataDictionary record, DataDictionaryExample example) {
        return dataDictionaryMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(DataDictionary record, DataDictionaryExample example) {
        return dataDictionaryMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(DataDictionary record) {
        return dataDictionaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DataDictionary record) {
        return dataDictionaryMapper.updateByPrimaryKey(record);
    }
}
