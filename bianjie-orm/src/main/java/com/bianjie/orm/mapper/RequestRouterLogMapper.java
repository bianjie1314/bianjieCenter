package com.bianjie.orm.mapper;

import com.bianjie.orm.pojo.RequestRouterLog;
import com.bianjie.orm.pojo.RequestRouterLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequestRouterLogMapper {
    int countByExample(RequestRouterLogExample example);

    int deleteByExample(RequestRouterLogExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(RequestRouterLog record);

    int insertSelective(RequestRouterLog record);

    List<RequestRouterLog> selectByExample(RequestRouterLogExample example);

    RequestRouterLog selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") RequestRouterLog record, @Param("example") RequestRouterLogExample example);

    int updateByExample(@Param("record") RequestRouterLog record, @Param("example") RequestRouterLogExample example);

    int updateByPrimaryKeySelective(RequestRouterLog record);

    int updateByPrimaryKey(RequestRouterLog record);
}