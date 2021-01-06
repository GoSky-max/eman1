package com.dragon.emanbonlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
class EmanBonlistApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
       // redisTemplate.opsForValue().set("123","234");
      //  System.out.println(redisTemplate.opsForValue().get("123"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        boolean b=redisTemplate.opsForValue().setIfAbsent("123","234",20,TimeUnit.SECONDS);
        if (b){
            return;
        }
        try{
            //........
        }finally {
            redisTemplate.delete("123");
        }







        redisTemplate.delete("123");
        AtomicInteger a = new AtomicInteger(1);
        a.addAndGet(1);
        System.out.println(a);
        threadPoolExecutor.execute(null);
    }

}
