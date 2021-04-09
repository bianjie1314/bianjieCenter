package com.dhd.third.jingdong.mapper;

import com.dhd.third.jingdong.pojo.DhdJdChannel;
import com.dhd.third.jingdong.pojo.DhdJdChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DhdJdChannelMapper {
    int countByExample(DhdJdChannelExample example);

    int deleteByExample(DhdJdChannelExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(DhdJdChannel record);

    int insertSelective(DhdJdChannel record);

    List<DhdJdChannel> selectByExample(DhdJdChannelExample example);

    DhdJdChannel selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") DhdJdChannel record, @Param("example") DhdJdChannelExample example);

    int updateByExample(@Param("record") DhdJdChannel record, @Param("example") DhdJdChannelExample example);

    int updateByPrimaryKeySelective(DhdJdChannel record);

    int updateByPrimaryKey(DhdJdChannel record);
}