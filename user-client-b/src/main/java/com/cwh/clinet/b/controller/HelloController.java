package com.cwh.clinet.b.controller;

import com.cwh.clinet.b.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserRemote userRemote;

    @GetMapping("user/b/hello")
    public String hello() {
        System.out.println("bbbbbbbbbbbb");
        return userRemote.hello();
    }

}
