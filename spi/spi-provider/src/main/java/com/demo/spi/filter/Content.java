package com.demo.spi.filter;

import lombok.Data;

/**
 * @author ligen
 * @title: Content
 * @projectName java
 * @description:
 * @date 2020/7/3110:20
 */

@Data
public class Content {

    //   不同的过滤器通过type 过滤
    private Integer type;

    //    消息体
    private String msg;

    @Override
    public String toString() {
        return "Content{" +
                "type=" + type +
                ", msg='" + msg + '\'' +
                '}';
    }
}
