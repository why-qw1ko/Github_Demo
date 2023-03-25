package com.buleng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("hello")
    public ArrayList hello() {
        ArrayList<Object> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        list2.add("dddd");
        list2.add("张嘉馨");
        list2.add("王海洋");
        list2.add("dddd");
        list1.add(0,123231);
        list1.add(1,list2);
        list1.add(2,"测试3");
        return list1;
    }
}
