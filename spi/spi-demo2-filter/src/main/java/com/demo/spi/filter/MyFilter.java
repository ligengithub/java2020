//package com.demo.spi.filter;
//
///**
// * @author ligen
// * @title: com.spi.filter.MyFilter
// * @projectName java
// * @description:
// * @date 2020/7/3113:36
// */
//public class MyFilter extends AbstuctFilter {
//
//    private static final Integer filterType = 4;
//
//
//
//    public MyFilter() {
//        super();
//    }
//
//
//    public void doFilter(Content context) {
//        doSomething(context);
//        super.doFilter(context);
//    }
//
//    public void doSomething(Content content) {
//
//        if (content.getType() == filterType) {
//            //todo
//
//            System.out.println("myFilter do someThing msg:" + content.getMsg());
//        } else {
//            System.out.println("myFilter do nothing --------");
//        }
//
//
//    }
//}
