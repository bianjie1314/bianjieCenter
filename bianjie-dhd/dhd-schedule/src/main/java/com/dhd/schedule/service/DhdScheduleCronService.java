package com.dhd.schedule.service;


import com.dhd.schedule.pojo.DhdScheduleCron;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/04/08
 */
public interface DhdScheduleCronService {


    int deleteByPrimaryKey(Integer cronId);

    int insert(DhdScheduleCron record);

    int insertSelective(DhdScheduleCron record);

    int updateByPrimaryKeySelective(DhdScheduleCron record);

    int updateByPrimaryKey(DhdScheduleCron record);

    public DhdScheduleCron selectByCronKey(String cronKey);

    public List<DhdScheduleCron> selectByMap(Map map);

}
