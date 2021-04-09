package com.dhd.third.taobao.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linmingxi
 * 2020/05/19
 **/
@RequestMapping(value = "/tb")
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
