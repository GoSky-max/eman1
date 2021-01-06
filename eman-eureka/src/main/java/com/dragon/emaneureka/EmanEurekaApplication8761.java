package com.dragon.emaneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmanEurekaApplication8761 {

    public static void main(String[] args) {
        SpringApplication.run(EmanEurekaApplication8761.class, args);
    }

}
