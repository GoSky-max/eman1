package com.dragon.emanporter.controller;

import com.dragon.emanporter.service.RedisCatchDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dragon
 * @create 2020-11-12-14:14
 */
@RestController
public class RedisCatchDeleteController {
    @Autowired
    private RedisCatchDeleteService redisCatchDeleteService;

    @RequestMapping("/Catch/delete")
    public void deleteRedisCatch(){
        redisCatchDeleteService.deleteRedisCatch();
    }
}
