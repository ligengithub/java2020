package com.demo.template;

/**
 * @author ligen
 * @title: DemoInterface
 * @projectName java
 * @description:
 * @date 2020/6/1214:48
 */
public abstract class DemoInterface {


    /**
     * @说明: 用户并不关心执行的详细细节，只是按照模板方法流程走即可
     */
    protected void step1() {
        System.out.println("default step1");
    }

    protected void step2() {
        System.out.println("default step2");
    }

    protected void step3() {
        System.out.println("default step3");
    }

    protected void step4() {
        System.out.println("default step4");
    }


    /**
     * @说明: 模板方法模式，抽象类中的一个模板方法它决定了执行的顺序和流程，核心是该方法
     */
    public void templateMethod() {
        this.step1();
        this.step2();

        /** 控制某个步骤执行或者不执行*/
        if (this.step3Run()) {
            this.step3();
        }

        this.step4();
    }

    /**
     * @说明: 默认第三步骤执行
     */
    protected boolean step3Run() {
        return true;
    }


}
