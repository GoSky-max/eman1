package com.dragon.emangateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EmanGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmanGatewayApplication.class, args);
    }

}
