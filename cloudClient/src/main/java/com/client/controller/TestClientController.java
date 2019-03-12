package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka客户端:服务提供方法
 * Created by flyqx on 2019/2/26.
 */
@RestController
public class TestClientController {

    @Autowired
    private DiscoveryClient client;

    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(@RequestParam Integer a, @RequestParam Integer b) {
        int res = a+b;
        System.out.println(" applicationName = "+applicationName);
        System.out.println(" 结果 = "+res);
        return res+"";
    }
}
