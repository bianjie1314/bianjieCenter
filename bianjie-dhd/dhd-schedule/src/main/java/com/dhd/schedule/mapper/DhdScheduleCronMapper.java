package com.dhd.schedule.mapper;

import com.dhd.schedule.pojo.DhdScheduleCron;
import com.dhd.schedule.pojo.DhdScheduleCronExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdScheduleCronMapper {
    int countByExample(DhdScheduleCronExample example);

    int deleteByExample(DhdScheduleCronExample example);

    int deleteByPrimaryKey(Integer cronId);

    int insert(DhdScheduleCron record);

    int insertSelective(DhdScheduleCron record);

    List<DhdScheduleCron> selectByExample(DhdScheduleCronExample example);

    DhdScheduleCron selectByPrimaryKey(Integer cronId);

    int updateByExampleSelective(@Param("record") DhdScheduleCron record, @Param("example") DhdScheduleCronExample example);

    int updateByExample(@Param("record") DhdScheduleCron record, @Param("example") DhdScheduleCronExample example);

    int updateByPrimaryKeySelective(DhdScheduleCron record);

    int updateByPrimaryKey(DhdScheduleCron record);
}