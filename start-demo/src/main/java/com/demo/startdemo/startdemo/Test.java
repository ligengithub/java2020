package com.demo.startdemo.startdemo;

import com.demo.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author ligen
 * @title: Test
 * @projectName java
 * @description:
 * @date 2020/7/2810:04
 */
@Component
public class Test {

    @Autowired
    private AnimalService animalService;


    @PostConstruct
    private void test(){
        animalService.doing();
    }


}
