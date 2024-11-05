package com.buleng.controller;

import com.buleng.domain.ResponseResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    //判断有没有这个权限，有的话才能访问
    @PreAuthorize("@ex.hasAuthority('system:dept:list111')")
    public List hello() {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        list2.add(1214);
        list1.add(0,123231);
        list1.add(1,list2);
        list1.add(2,"测试3");
        return list1;
    }

    @RequestMapping("/textCors")
    public ResponseResult textCors() {
        return new ResponseResult(200,"textCors");
    }
}
