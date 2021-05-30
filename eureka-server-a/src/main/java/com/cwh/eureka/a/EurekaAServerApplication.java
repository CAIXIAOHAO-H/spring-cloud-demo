package com.cwh.eureka.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaAServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAServerApplication.class, args);
    }

}
