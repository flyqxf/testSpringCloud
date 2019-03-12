package com.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by flyqx on 2019/3/11.
 */
@FeignClient(value="eurekaclient")
public interface ITestFeign {

    @RequestMapping(value="add",method = RequestMethod.GET)
    public String add(@RequestParam(value = "a") int a,@RequestParam(value = "b") int b);

}
