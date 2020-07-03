package com.demo.template;

/**
 * @author ligen
 * @title: Impl1
 * @projectName java
 * @description:
 * @date 2020/6/1215:11
 */
public class Impl1 extends DemoInterface {

    @Override
    protected void step2() {
        System.out.println("Impl1 step2");
    }

    @Override
    protected void step3() {
        System.out.println("Impl1 step3");
    }

    @Override
    protected void step4() {
        System.out.println("Impl1 step4");
    }

    @Override
    protected boolean step3Run() {
        return super.step3Run();
    }

    @Override
    public void step1() {
        System.out.println("Impl1 step1");
    }

    @Override
    public void templateMethod() {
        super.templateMethod();
    }
}
