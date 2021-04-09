package com.dhd.schedule.service.impl;

import com.dhd.schedule.mapper.DhdScheduleCronMapper;
import com.dhd.schedule.mapper.define.DhdScheduleCronDefineMapper;
import com.dhd.schedule.pojo.DhdScheduleCron;
import com.dhd.schedule.service.DhdScheduleCronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/04/08
 */
@Service
public class DhdScheduleCronServiceImpl implements DhdScheduleCronService {

    @Autowired
    DhdScheduleCronMapper dhdScheduleCronMapper;
    @Autowired
    DhdScheduleCronDefineMapper dhdScheduleCronDefineMapper;

    @Override
    public int deleteByPrimaryKey(Integer cronId) {
        return dhdScheduleCronMapper.deleteByPrimaryKey(cronId);
    }

    @Override
    public int insert(DhdScheduleCron record) {
        return dhdScheduleCronMapper.insert(record);
    }

    @Override
    public int insertSelective(DhdScheduleCron record) {
        return dhdScheduleCronMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(DhdScheduleCron record) {
        return dhdScheduleCronMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DhdScheduleCron record) {
        return dhdScheduleCronMapper.updateByPrimaryKey(record);
    }

    @Override
    public DhdScheduleCron selectByCronKey(String cronKey) {
        return dhdScheduleCronDefineMapper.selectByCronKey(cronKey);
    }

    @Override
    public List<DhdScheduleCron> selectByMap(Map map) {
        return dhdScheduleCronDefineMapper.selectByMap(map);
    }
}
