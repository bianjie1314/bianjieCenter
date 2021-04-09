package com.dhd.business.service.impl;

import com.dhd.business.mapper.DhdCustomerMenuMapper;
import com.dhd.business.pojo.DhdCustomerMenu;
import com.dhd.business.pojo.DhdCustomerMenuExample;
import com.dhd.business.service.IDhdCustomerMenuService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/22
 */
@Service
public class DhdCustomerMenuServiceImpl implements IDhdCustomerMenuService {

    @Autowired
    DhdCustomerMenuMapper dhdCustomerMenuMapper;


    @Override
    public List<DhdCustomerMenu> selectByExample(DhdCustomerMenuExample example) {
        return dhdCustomerMenuMapper.selectByExample(example);
    }

    @Override
    public List<DhdCustomerMenu> selectByMap(Map param) {
        return selectByExample(initQryParam(param,true));
    }


    private DhdCustomerMenuExample initQryParam(Map map,boolean initPage){
        DhdCustomerMenuExample example = new DhdCustomerMenuExample();
        DhdCustomerMenuExample.Criteria criteria = example.createCriteria();
        if (map.containsKey("platform")){
            criteria.andPlatformEqualTo((Integer) map.get("platform"));
        }
        if (map.containsKey("type")){
            criteria.andTypeEqualTo((Integer) map.get("type"));
        }
        if (map.containsKey("status")){
            criteria.andStatusEqualTo((Integer) map.get("status"));
        }
        if (initPage && map.containsKey("currentPage") && map.containsKey("pageSize")){
            PageHelper.startPage((Integer) map.get("currentPage"),(Integer) map.get("pageSize"));
        }
        return example;
    }
}
