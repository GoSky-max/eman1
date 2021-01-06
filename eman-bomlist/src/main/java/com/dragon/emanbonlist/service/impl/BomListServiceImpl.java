package com.dragon.emanbonlist.service.impl;

import com.dragon.emanbonlist.dao.EmanListMapper;
import com.dragon.emanbonlist.pojo.EmanList;
import com.dragon.emanbonlist.service.BomListService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.data.domain.Example;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Dragon
 * @create 2020-11-11-14:46
 */
@Service("BomListService")
public class BomListServiceImpl implements BomListService {
    @Autowired
    private EmanListMapper emanListMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Autowired
    private Gson gson;

    @Value("${CACHE_REDIS_BOMLIST}")
    private String CACHE_REDIS_BOMLIST;

    @Override
    @Transactional
    public void saveBomList(EmanList emanList) {


        int insert = emanListMapper.insert(emanList);
        System.out.println(insert);
        if (insert==1) {
            String o = (String)redisTemplate.opsForHash().get(CACHE_REDIS_BOMLIST, "1000");
            if (o!=null&&!o.isEmpty()) {
                redisTemplate.opsForHash().delete(CACHE_REDIS_BOMLIST,"1000");
            }

        }

    }

    @Override
    public List<EmanList> getBomlist() {

        List<EmanList> emanLists = emanListMapper.selectBomList();
        return emanLists;

    }

    @Override
    public EmanList selectMoldData(Integer modleno) {

        try {
            String o = (String)redisTemplate.opsForHash().get(CACHE_REDIS_BOMLIST, modleno + "");
            if (o!=null&&!o.isEmpty()){
                redisTemplate.expire(CACHE_REDIS_BOMLIST,60*60*24, TimeUnit.SECONDS);
                EmanList emanList = gson.fromJson(o, EmanList.class);
                System.out.println("缓存取值"+emanList);
                return emanList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        EmanList emanList = emanListMapper.selectByPrimaryKey(modleno);
        System.out.println(emanList);
        try {
            String json = gson.toJson(emanList);
            redisTemplate.opsForHash().put(CACHE_REDIS_BOMLIST,modleno+"",json);
            redisTemplate.expire(CACHE_REDIS_BOMLIST,60*60*24, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return emanList;
    }

    @Override
    public int updateBomlist(EmanList emanList) {
        int i = emanListMapper.updateByPrimaryKey(emanList);
        return i;
    }
}
