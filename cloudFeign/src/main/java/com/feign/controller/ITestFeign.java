package com.feign.controller;

import com.feign.service.ITestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flyqx on 2019/3/11.
 */
@RestController
public class ITestFeign {

    @Autowired
    private ITestFeignService testFeignService;
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {

        String res = testFeignService.add(10,15);
        return res;
    }


}
