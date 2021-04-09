package com.dhd.app.controller;

import com.dhd.app.controller.base.BaseController;
import com.dhd.common.model.AppRequestModel;
import com.dhd.common.model.AppResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linmingxi
 * 2021/02/04
 */
@RestController("/index")
public class IndexContoller extends BaseController {


    @RequestMapping("/banner")
    @ResponseBody
    public AppResponseModel index(@RequestBody AppRequestModel appRequestModel){

        //背景图

        //轮播图


        //菜单栏

        //推荐栏目

        //类目

        return AppResponseModel.getInstance(appRequestModel.getTid(),null);

    }

}
