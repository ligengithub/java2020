package com.demo.spi.filter;

import lombok.Data;

/**
 * @author ligen
 * @title: OuterFilter1
 * @projectName java
 * @description:
 * @date 2020/7/3110:16
 */
@Data
public class OuterFilter3 extends AbstuctFilter {

    private static final Integer filterType = 3;

    private static Filter nextFilter = null;
    private static Filter beforeFilter = new OuterFilter2();

    public OuterFilter3() {
        super(beforeFilter);
    }


    @Override
    public void doFilter(Content context) {
        // todo
        doSomething(context);
        super.doFilter(context);
    }

    public void doSomething(Content content) {
        if (content.getType() == 3) {
            //todo
            System.out.println("filter3 doing----- msg" + content.getMsg());
        } else {
            System.out.println("filter3 do nothing ---------");
        }
    }
}
