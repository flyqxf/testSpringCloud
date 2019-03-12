package com.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by flyqx on 2019/2/26.
 */
@RestController
public class TestRobbinController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "error")
    public String add() {

//        String str =restTemplate.getForEntity("http://eurekaclient/add?a=10&b=20", String.class).getBody();
        String str =restTemplate.getForObject("http://eurekaclient/add?a=10&b=20", String.class);
        return str;
    }

    /**
     * 断路器
     * @return
     */
    public String error() {
        return "服务关闭";
    }
}
