package com.demo.template;

/**
 * @author ligen
 * @title: Main
 * @projectName java
 * @description:
 * @date 2020/6/1215:14
 */
public class Main {

    public static void main(String[] args) {


        /**
         * @说明:  我的理解
         *  就像结婚，所有的婚庆公式都是按照一个模板走流程。不过不同的婚庆公司，流程中的每一步细节可能不一样，你花的钱的多少，流程大体也不会变，
         *  只不过可能会少一点环节，多一些环节。。。你只需要举办婚礼(调用模板方法)，，然后就按照流程给你举办婚礼。你不需要每个流程的细节实现( 接口或者抽象类 protected 方法)
         *
         *  你只是需要一个完整的流程。这个流程由婚庆公司已经安排好了。调用举办婚礼方法，这个流程就开始执行。
         */

        Impl1 impl1 = new Impl1();
        impl1.templateMethod();


        // Impl2 不想执行step3
        Impl2 impl2 = new Impl2();
        impl2.setStep3Flag(false);
        impl2.templateMethod();

    }

}
