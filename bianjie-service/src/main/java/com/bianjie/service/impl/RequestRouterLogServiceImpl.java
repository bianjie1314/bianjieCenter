package com.bianjie.service.impl;

import com.bianjie.orm.mapper.RequestRouterLogMapper;
import com.bianjie.orm.pojo.RequestRouterLog;
import com.bianjie.orm.pojo.RequestRouterLogExample;
import com.bianjie.service.IRequestRouterLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linmingxi
 * 2020/06/05
 */
@Service
public class RequestRouterLogServiceImpl implements IRequestRouterLogService {

    @Autowired
    RequestRouterLogMapper requestRouterLogMapper;

    @Override
    public int countByExample(RequestRouterLogExample example) {
        return requestRouterLogMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RequestRouterLogExample example) {
        return requestRouterLogMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sid) {
        return requestRouterLogMapper.deleteByPrimaryKey(sid);
    }

    @Override
    public int insert(RequestRouterLog record) {
        return requestRouterLogMapper.insert(record);
    }

    @Override
    public int insertSelective(RequestRouterLog record) {
        return requestRouterLogMapper.insertSelective(record);
    }

    @Override
    public List<RequestRouterLog> selectByExample(RequestRouterLogExample example) {
        return requestRouterLogMapper.selectByExample(example);
    }

    @Override
    public RequestRouterLog selectByPrimaryKey(Integer sid) {
        return requestRouterLogMapper.selectByPrimaryKey(sid);
    }

    @Override
    public int updateByExampleSelective(RequestRouterLog record, RequestRouterLogExample example) {
        return requestRouterLogMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(RequestRouterLog record, RequestRouterLogExample example) {
        return requestRouterLogMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(RequestRouterLog record) {
        return requestRouterLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RequestRouterLog record) {
        return requestRouterLogMapper.updateByPrimaryKey(record);
    }
}
