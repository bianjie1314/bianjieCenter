package com.dhd.third.jingdong.service.impl;

import com.dhd.third.jingdong.mapper.DhdJdDownDirectMapper;
import com.dhd.third.jingdong.pojo.DhdJdDownDirect;
import com.dhd.third.jingdong.pojo.DhdJdDownDirectExample;
import com.dhd.third.jingdong.service.IJdDownDirectService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/12/20
 */
@Service
public class JdDownDirectServiceImpl implements IJdDownDirectService {

    @Autowired
    DhdJdDownDirectMapper jdDownDirectMapper;


    @Override
    public List<DhdJdDownDirect> selectByExample(DhdJdDownDirectExample example) {
        return jdDownDirectMapper.selectByExample(example);
    }

    @Override
    public List<DhdJdDownDirect> selectByMap(Map map) {
        return jdDownDirectMapper.selectByExample(initQryParam(map,true));
    }

    @Override
    public int countByMap(Map map) {
        return jdDownDirectMapper.countByExample(initQryParam(map,false));
    }

    @Override
    public int countByExample(DhdJdDownDirectExample example) {
        return jdDownDirectMapper.countByExample(example);
    }

    private DhdJdDownDirectExample initQryParam(Map map,boolean initPage){
        DhdJdDownDirectExample example = new DhdJdDownDirectExample();
        DhdJdDownDirectExample.Criteria criteria = example.createCriteria();
        StringBuffer buffer = new StringBuffer();
        if (map.containsKey("goodName") && map.get("goodName") != null){
            buffer.append("%").append(map.get("goodName")).append("%");
            criteria.andNameLike(buffer.toString());
        }
        if (initPage && map.containsKey("currentPage") && map.containsKey("pageSize")){
            PageHelper.startPage((Integer) map.get("currentPage"),(Integer) map.get("pageSize"));
        }
        return example;
    }
}
