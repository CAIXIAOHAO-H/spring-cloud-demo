package com.cwh.user.client.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user/a/hello")
    public String hello() {
        String serverName = "user-server";
        String url = "http://" + serverName + "/hello";
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }

}
