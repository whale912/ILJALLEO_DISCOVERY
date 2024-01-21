package com.whale.iljalleo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IljalleoDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IljalleoDiscoveryApplication.class, args);
    }

}
