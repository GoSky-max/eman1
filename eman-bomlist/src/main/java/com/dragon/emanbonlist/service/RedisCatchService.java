package com.dragon.emanbonlist.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dragon
 * @create 2020-11-12-14:02
 */

public interface RedisCatchService {

    public void deleteRedisCatch();
}
