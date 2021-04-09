package com.bianjie.service;

import com.bianjie.orm.pojo.RequestRouterLog;
import com.bianjie.orm.pojo.RequestRouterLogExample;

import java.util.List;

public interface IRequestRouterLogService {
    int countByExample(RequestRouterLogExample example);

    int deleteByExample(RequestRouterLogExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(RequestRouterLog record);

    int insertSelective(RequestRouterLog record);

    List<RequestRouterLog> selectByExample(RequestRouterLogExample example);

    RequestRouterLog selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(RequestRouterLog record, RequestRouterLogExample example);

    int updateByExample(RequestRouterLog record, RequestRouterLogExample example);

    int updateByPrimaryKeySelective(RequestRouterLog record);

    int updateByPrimaryKey(RequestRouterLog record);
}