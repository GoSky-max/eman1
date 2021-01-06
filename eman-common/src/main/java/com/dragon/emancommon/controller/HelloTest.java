package com.dragon.emancommon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dragon
 * @create 2020-11-11-9:33
 */
@RestController
public class HelloTest {
    @RequestMapping("/Hello")
    public String Hello(){
        return "Hello Test";
    }
}
