package com.dhd.business.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmingxi
 * 2021/01/22
 */
@RestController("/business")
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

}
