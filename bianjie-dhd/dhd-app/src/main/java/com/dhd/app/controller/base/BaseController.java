package com.dhd.app.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linmingxi
 * 2021/01/22
 */
@RequestMapping("/app")
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

}
