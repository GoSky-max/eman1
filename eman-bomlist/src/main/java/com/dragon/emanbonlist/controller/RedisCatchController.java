package com.dragon.emanbonlist.controller;

import com.dragon.emanbonlist.service.RedisCatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dragon
 * @create 2020-11-12-14:00
 */
@RestController
public class RedisCatchController {


    @Autowired
    private RedisCatchService redisCatchService;

    @RequestMapping("/Catch/delete")
    public void deleteRedisCatch(){
        redisCatchService.deleteRedisCatch();
    }

}
