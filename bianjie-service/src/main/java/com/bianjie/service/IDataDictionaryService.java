package com.bianjie.service;

import com.bianjie.orm.pojo.DataDictionary;
import com.bianjie.orm.pojo.DataDictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDataDictionaryService {
    int countByExample(DataDictionaryExample example);

    int deleteByExample(DataDictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    List<DataDictionary> selectByExample(DataDictionaryExample example);

    DataDictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(DataDictionary record, DataDictionaryExample example);

    int updateByExample(DataDictionary record, DataDictionaryExample example);

    int updateByPrimaryKeySelective(DataDictionary record);

    int updateByPrimaryKey(DataDictionary record);
}