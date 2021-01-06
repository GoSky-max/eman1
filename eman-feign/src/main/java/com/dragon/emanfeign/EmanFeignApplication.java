package com.dragon.emanfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EmanFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmanFeignApplication.class, args);
    }

}
