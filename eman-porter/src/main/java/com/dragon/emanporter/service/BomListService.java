package com.dragon.emanporter.service;

import com.dragon.emanporter.fallback.MyFallbackFactory;
import com.dragon.emanporter.pojo.EmanList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dragon
 * @create 2020-11-11-15:11
 */
@FeignClient(name = "eman-bomlist")
public interface BomListService {
    @PostMapping("/saveList")
    public String saveList(EmanList emanList);

    @GetMapping("/getList")
    public List<EmanList> getList();

    @GetMapping("/getMoldData/{ID}")
    public EmanList selectMoldData(@PathVariable("ID") Integer modleno);
}
