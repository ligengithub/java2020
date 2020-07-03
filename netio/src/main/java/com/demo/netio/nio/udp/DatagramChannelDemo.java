package com.demo.netio.nio.udp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

/**
 * @author ligen
 * @title: nio.DatagramChannelDemo     UDP
 * <p>
 * 因为UDP是一个无连接的协议，所以不能像其它Channel一样，写Channel和读Channel  它是通过收发数据包的形式。
 * @projectName noidemo
 * @description:
 * @date 2019/9/1216:03
 */
public class DatagramChannelDemo {
    public static void main(String[] args) throws IOException {
        DatagramChannel channel = DatagramChannel.open();

        channel.socket().bind(new InetSocketAddress("127.0.0.1", 4444));
        ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.clear();
        while (true) {
            // 接收数据
            channel.receive(buffer);  //阻塞

            //发送数据
//            buffer.put("1111111".getBytes());
            buffer.flip();
            channel.send(buffer, new InetSocketAddress("127.0.0.1", 10000));
            buffer.clear();

        }


    }
}
