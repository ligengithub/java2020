package com.demo.spi.filter;

import lombok.Data;

/**
 * @author ligen
 * @title: AbstuctFilter
 * @projectName java
 * @description:
 * @date 2020/7/3110:17
 */
@Data
public abstract class AbstuctFilter implements Filter {



    public AbstuctFilter( ) {
    }


//    @Override
//    public void doFilter(Content context) {
//        // 是否还有下一个过滤器
//        if ( == null) {
//            System.out.println("过滤结束");
//        } else {
//            nextFilter.doFilter(context);
//        }
//
//    }
}
