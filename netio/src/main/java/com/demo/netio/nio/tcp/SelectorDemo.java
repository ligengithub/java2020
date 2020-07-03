package com.demo.netio.nio.tcp;

import com.sun.javafx.collections.MappingChange;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ligen
 * @title: nio.SelectorDemo
 * @projectName noidemo
 * @description:
 * @date 2019/9/1210:36
 */
public class SelectorDemo {

    /**
     * @说明: selector
     * 选择器，也就是监听器，可以将多个Channel绑定到这个selector上，用selector来监听各个通道的事件。
     * <p>
     * 注意点 ; 与Selector配合使用，必须配置Channel处于非阻塞模式下
     */
    public static void main(String[] args) throws IOException {

        // 创建一个Selector
        Selector selector = Selector.open();


        //创建通道   适用于一个事件类型 ACCEPT
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 配置非阻塞，Channel 与Selector 配合使用必须配置非阻塞
        ssc.configureBlocking(false);
        //  通道的socket绑定为1234
        ssc.socket().bind(new InetSocketAddress(1234));
        // 配置通道 绑定监听器，以及通知事件

        //创建通道   适用于一个事件类型 ACCEPT
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        // 配置非阻塞，Channel 与Selector 配合使用必须配置非阻塞
        ssc2.configureBlocking(false);
        //  通道的socket绑定为1234
        ssc2.socket().bind(new InetSocketAddress(1235));
        // 配置通道 绑定监听器，以及通知事件

        /**
         * @说明: key    当 事件发生的时候，selectedKeys() 返回的就是对应的这个key
         *   这个key 拿来和之后发生事件的key 比对，，来区分 是否是本通道
         *
         *   同理，可以设置若干个通道，每个通达都通过这个方式绑定，会由不同的key
         */
        SelectionKey key = ssc.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey key2 = ssc2.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            int channels = selector.select();

            if (channels == 0) continue;
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator iterator = keys.iterator();
            while (iterator.hasNext()) {
                SelectionKey getKey = (SelectionKey) iterator.next();
                // 通过key 来确定通道 通道1
                if (key.equals(getKey)) {
                    if (getKey.isAcceptable()) {
                        System.out.println("accept 通道1");
                        ServerSocketChannel channel = (ServerSocketChannel) getKey.channel();

//                        channel.close();
                    }
                    // ServerSocketChannel 只支持ACCEPT 事件
//                    else if (getKey.isConnectable()) {
//                        System.out.println("connect");
//                    } else if (getKey.isReadable()) {
//                        System.out.println("read");
//                    } else if (getKey.isWritable()) {
//                        System.out.println("write");
//                    }
                }
                // 通道2
                else if (key2.equals(getKey)) {
                    if (getKey.isAcceptable()) {
                        System.out.println("accept 通道2");
                    }
                }

                // 处理完成以后，要删除掉。
              iterator.remove();
            }
        }
    }

    public void test(Map){

    }

}
