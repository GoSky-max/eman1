package com.dragon.emanconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class EmanConfigApplicationTests {



    @Test
    void contextLoads() {
        AtomicInteger num = new AtomicInteger(0);
//        if()
        int i = num.addAndGet(1);
//        num.getAndAdd()
//        At
//        List<Map<String,Boolean>>
    }

}
