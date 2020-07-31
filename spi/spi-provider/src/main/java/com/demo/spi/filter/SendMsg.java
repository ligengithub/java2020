package com.demo.spi.filter;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author ligen
 * @title: SendMsg
 * @projectName java
 * @description:
 * @date 2020/7/3110:35
 */
public class SendMsg {

    static {


        ServiceLoader<Filter> load = ServiceLoader.load(Filter.class);
        Iterator<Filter> iterator = load.iterator();

        while (iterator.hasNext()) {
            Filter next = iterator.next();
            try {
                FilterManang.addFilter(next.getClass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }


    public void send(Content content) {

        if (FilterManang.getFilterSize() > 0) {
            FilterManang.getHeadFilter().doFilter(content);
        }
        System.out.println("发送消息为:" + content.toString());
    }
}
