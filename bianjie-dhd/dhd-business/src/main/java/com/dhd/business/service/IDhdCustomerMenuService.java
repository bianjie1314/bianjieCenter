package com.dhd.business.service;

import com.dhd.business.pojo.DhdCustomerMenu;
import com.dhd.business.pojo.DhdCustomerMenuExample;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/22
 */
public interface IDhdCustomerMenuService {

    List<DhdCustomerMenu> selectByExample(DhdCustomerMenuExample example);

    List<DhdCustomerMenu> selectByMap(Map param);

}
