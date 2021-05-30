package com.cwh.clinet.b.remote;

import org.springframework.stereotype.Component;

@Component
public class UserRemoteHystrix implements UserRemote {

    @Override
    public String hello() {
        return "this is userRemotHystrix";
    }

}
