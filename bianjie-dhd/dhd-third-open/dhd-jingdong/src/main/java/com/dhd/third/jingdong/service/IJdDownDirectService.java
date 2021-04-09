package com.dhd.third.jingdong.service;


import com.dhd.third.jingdong.pojo.DhdJdDownDirect;
import com.dhd.third.jingdong.pojo.DhdJdDownDirectExample;

import java.util.List;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/12/20
 */
public interface IJdDownDirectService {


    List<DhdJdDownDirect> selectByExample(DhdJdDownDirectExample example);


    int countByExample(DhdJdDownDirectExample example);

    List<DhdJdDownDirect> selectByMap(Map map);

    int countByMap(Map map);

}
