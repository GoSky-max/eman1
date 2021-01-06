package com.dragon.emanbonlist.service;

import com.dragon.emanbonlist.pojo.EmanList;

import java.util.List;

/**
 * @author Dragon
 * @create 2020-11-11-14:40
 */
public interface BomListService {

    public void saveBomList(EmanList emanList);

    public List<EmanList> getBomlist();

    public EmanList selectMoldData(Integer modleno);



    public int updateBomlist(EmanList emanList);
}
