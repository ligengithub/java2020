package com.demo.spi.filter;

import com.demo.spi.filter.Content;
import com.demo.spi.filter.SendMsg;

/**
 * @author ligen
 * @title: com.spi.filter.Main
 * @projectName java
 * @description: 责任链模式+ SPI 拓展
 * <p>
 * 引入jar 包实现 Filter的功能，并且可以自定义Filter 添加到链路中。
 *
 * 学习责任链设计模式，和SPI 拓展的实践
 * @date 2020/7/3110:13
 */
public class Main {

    public static void main(String[] args) {

        SendMsg sendMsg = new SendMsg();
        sendMsg.send(new Content(){{
            setMsg("hahahah");
            setType(1);
        }});
    }


}
