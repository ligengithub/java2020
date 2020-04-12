package com.demo.agency;

/**
 * @author ligen
 * @title: BeAgency
 * @projectName java2020
 * @description: 被代理人
 * @date 2020/4/816:45
 */
public class BeAgency1 implements PublicMethod {


    public String work() {
        return "我是被代理人:" + this.getClass().getName() + "，我在干活";
    }
}
