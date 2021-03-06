package com.cwh.user.server.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserServerAApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServerAApplication.class, args);
    }

}
