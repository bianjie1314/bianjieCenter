package com.dhd.app.service.impl;

import com.dhd.app.mapper.DhdUserMapper;
import com.dhd.app.pojo.DhdUser;
import com.dhd.app.pojo.DhdUserExample;
import com.dhd.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linmingxi
 * 2021/02/04
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    DhdUserMapper dhdUserMapper;

    @Override
    public List<DhdUser> selectByExample(DhdUserExample example) {
        return dhdUserMapper.selectByExample(example);
    }

    @Override
    public DhdUser selectByPrimaryKey(String telephone) {
        return dhdUserMapper.selectByPrimaryKey(telephone);
    }

}
