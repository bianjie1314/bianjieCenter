package com.bianjie.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linmingxi
 * 2020/05/20
 **/
public class PageRequest extends Page {

    private Map param = new HashMap();

    public Map getParam() {
        return param;
    }

    public void setParam(Map param) {
        this.param = param;
    }
}
