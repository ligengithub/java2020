package com.demo.template;

/**
 * @author ligen
 * @title: Impl1
 * @projectName java
 * @description:
 * @date 2020/6/1215:11
 */
public class Impl2 extends DemoInterface {
    private boolean step3Flag = true;

    @Override
    protected void step1() {
        System.out.println("Impl2 step1");
    }

    @Override
    protected void step2() {
        System.out.println("Impl2 step2");
    }

    @Override
    protected void step3() {
        System.out.println("Impl2 step3");
    }

    @Override
    protected void step4() {
        System.out.println("Impl2 step4");
    }

    @Override
    public void templateMethod() {
        super.templateMethod();
    }

    @Override
    protected boolean step3Run() {
        return this.step3Flag;
    }

    public void setStep3Flag(boolean flag) {
        this.step3Flag = flag;
    }
}
