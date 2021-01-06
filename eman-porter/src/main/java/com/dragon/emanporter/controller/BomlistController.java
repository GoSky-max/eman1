package com.dragon.emanporter.controller;

import com.dragon.emanporter.pojo.EmanList;
import com.dragon.emanporter.service.BomListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Dragon
 * @create 2020-11-11-12:13
 */
@RestController
public class BomlistController {
    @Autowired
    private BomListService bomListService;


    @PostMapping("/SaveList")
    private String SaveList(){
        EmanList emanList = new EmanList();
        emanList.setModleno(4001);
        emanList.setDesigner("吴风");
        emanList.setLeader("单士友");
        emanList.setStatus(1);
        return bomListService.saveList(emanList);
    }

    @GetMapping("/getList")
    public List<EmanList> getList(){
        return  bomListService.getList();
    }

    @GetMapping("/getMoldData/{ID}")
    public EmanList selectMoldData(@PathVariable("ID")Integer modleno){
        EmanList emanList = bomListService.selectMoldData(modleno);
        return emanList;
    }
}
