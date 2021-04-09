package com.dhd.common.model;

import com.bianjie.common.Page;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linmingxi
 * 2021/01/01
 */
public class H5RequestModel {

    //参数
    private Map param = new HashMap();
    //分页
    private Page page = new Page();
    //权限编码
    private String au;
    //版本
    private String v;

    public Map getParam() {
        return param;
    }

    public void setParam(Map param) {
        this.param = param;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }
}
