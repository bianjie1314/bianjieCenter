package com.dhd.schedule.mapper.define;

import com.dhd.schedule.pojo.DhdScheduleCron;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/04/08
 */
public interface DhdScheduleCronDefineMapper {

    public DhdScheduleCron selectByCronKey(@Param("cronKey") String cronKey);

    public List<DhdScheduleCron> selectByMap(Map map);

}
