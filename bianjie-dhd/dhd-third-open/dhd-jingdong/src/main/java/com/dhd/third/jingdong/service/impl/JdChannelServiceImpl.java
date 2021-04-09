package com.dhd.third.jingdong.service.impl;

import com.dhd.third.jingdong.mapper.DhdJdChannelMapper;
import com.dhd.third.jingdong.pojo.DhdJdChannel;
import com.dhd.third.jingdong.pojo.DhdJdChannelExample;
import com.dhd.third.jingdong.service.IJdChannelService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/12/24
 */
@Service
public class JdChannelServiceImpl implements IJdChannelService {

    @Autowired
    DhdJdChannelMapper jdChannelMapper;


    @Override
    public DhdJdChannel selectByPrimaryKey(Integer sid) {
        return jdChannelMapper.selectByPrimaryKey(sid);
    }

    @Override
    public List<DhdJdChannel> selectByExample(DhdJdChannelExample example) {
        return jdChannelMapper.selectByExample(example);
    }

    @Override
    public int countByExample(DhdJdChannelExample example) {
        return jdChannelMapper.countByExample(example);
    }

    @Override
    public List<DhdJdChannel> selectByMap(Map map) {
        return jdChannelMapper.selectByExample(initQryParam(map,true));
    }

    @Override
    public int countByMap(Map map) {
        return jdChannelMapper.countByExample(initQryParam(map,false));
    }


    private DhdJdChannelExample initQryParam(Map map,boolean initPage){
        DhdJdChannelExample example = new DhdJdChannelExample();
        DhdJdChannelExample.Criteria criteria = example.createCriteria();
        if (map.containsKey("status")){
            criteria.andStatusEqualTo((Integer) map.get("status"));
        }
        if (map.containsKey("channelName")){
            criteria.andChannelNameEqualTo((String) map.get("channelName"));
        }
        if (map.containsKey("channelId")){
            criteria.andChannelIdEqualTo((Integer) map.get("channelId"));
        }
        if (initPage && map.containsKey("currentPage") && map.containsKey("pageSize")){
            PageHelper.startPage((Integer) map.get("currentPage"),(Integer) map.get("pageSize"));
        }
        return example;
    }
}
