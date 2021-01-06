package com.dragon.emanporter.fallback;

import com.dragon.emanporter.service.BomListService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Dragon
 * @create 2020-11-11-12:14
 */
//@Component
public class MyFallbackFactory {

//    @Override
//    public BomListService create(Throwable throwable) {
//        return new BomListService() {
//            @Override
//            public String saveList() {
//                System.out.println(throwable.getMessage());
//                return throwable.getMessage();
//            }
//
//            @Override
//            public String getList() {
//                System.out.println(throwable.getMessage());
//                return throwable.getMessage();
//            }
//        };
//    }
}
