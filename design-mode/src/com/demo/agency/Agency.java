package com.demo.agency;

/**
 * @author ligen
 * @title: BeAgency
 * @projectName java2020
 * @description: 代理人
 * @date 2020/4/816:45
 */
public class Agency implements PublicMethod {

    private PublicMethod publicMethod;

    public Agency(PublicMethod publicMethod) {
        this.publicMethod = publicMethod;
    }

    public String work() {
        // 真正干活的还是被代理人
        return publicMethod.work();
    }
}
