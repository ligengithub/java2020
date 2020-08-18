//package com.demo.spi.filter;
//
//import lombok.Data;
//
///**
// * @author ligen
// * @title: OuterFilter1
// * @projectName java
// * @description:
// * @date 2020/7/3110:16
// */
//@Data
//public class OuterFilter1 extends AbstuctFilter {
//
//    private static final Integer filterType = 1;
//
//    private static Filter beforeFilter = null;
//
//
//    public OuterFilter1() {
//        super(beforeFilter);
//    }
//
//    @Override
//    public void doFilter(Content context) {
//        // todo
//        doSomething(context);
//        super.doFilter(context);
//    }
//
//    public void doSomething(Content content) {
//        if (content.getType() == 1) {
//            //todo
//            System.out.println("filter1 doing----- msg" + content.getMsg());
//        } else {
//            System.out.println("filter2 do nothing ---------");
//        }
//
//    }
//
//
//
//
//}
