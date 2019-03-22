package com.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by flyqx on 2019/3/22.
 */
@FeignClient(value="eurekaclient")
@Service
public interface ITestFeignService {
    @RequestMapping(value="add",method = RequestMethod.GET)
    public String add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
