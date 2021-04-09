package com.dhd.third.jingdong.service;


import com.dhd.third.jingdong.pojo.DhdJdChannel;
import com.dhd.third.jingdong.pojo.DhdJdChannelExample;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/12/24
 */
public interface IJdChannelService {

    DhdJdChannel selectByPrimaryKey(Integer sid);

    List<DhdJdChannel> selectByExample(DhdJdChannelExample example);

    int countByExample(DhdJdChannelExample example);

    List<DhdJdChannel> selectByMap(Map map);

    int countByMap(Map map);

}
