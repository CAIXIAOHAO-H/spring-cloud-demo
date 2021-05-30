package com.cwh.clinet.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserClientBApplication.class, args);
    }

}
