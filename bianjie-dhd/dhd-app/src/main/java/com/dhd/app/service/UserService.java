package com.dhd.app.service;


import com.dhd.app.pojo.DhdUser;
import com.dhd.app.pojo.DhdUserExample;

import java.util.List;

/**
 * @author linmingxi
 * 2021/02/04
 */
public interface UserService {

    List<DhdUser> selectByExample(DhdUserExample example);

    DhdUser selectByPrimaryKey(String telephone);

}
