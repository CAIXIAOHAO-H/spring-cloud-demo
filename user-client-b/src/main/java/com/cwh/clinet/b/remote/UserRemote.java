package com.cwh.clinet.b.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-server", fallback = UserRemoteHystrix.class)
public interface UserRemote {

    @RequestMapping("/hello")
    public String hello();

}
