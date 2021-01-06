package com.dragon.emanbonlist.controller;

import com.dragon.emanbonlist.pojo.EmanList;
import com.dragon.emanbonlist.service.BomListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dragon
 * @create 2020-11-11-15:05
 */
@RestController
public class BomListController {

    @Autowired
    private BomListService bomListService;

    @Autowired
    private RedisCatchController redisCatchController;

    @PostMapping("/saveList")
    private String saveList(@RequestBody EmanList emanList){

        bomListService.saveBomList(emanList);
        return "success";
    }

    @GetMapping("/getList")
    private List<EmanList> getList(){
        List<EmanList> bomlist = bomListService.getBomlist();

        for(EmanList emanList:bomlist){
            System.out.println(emanList);
        }
        return bomlist;
    }
    @GetMapping("/getMoldData/{ID}")
    public EmanList selectMoldData(@PathVariable("ID")Integer modleno){
        EmanList emanList = bomListService.selectMoldData(modleno);
        return emanList;
    }

    @PutMapping("/getMoldData")
    public void updateBomlist(@RequestBody EmanList emanList){
        int i = bomListService.updateBomlist(emanList);
        System.out.println(i);
        if (i==0)
            redisCatchController.deleteRedisCatch();
    }
}
