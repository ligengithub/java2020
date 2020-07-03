package com.demo.netio.nio.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author ligen
 * @title: nio.ServerSocketChannelDemo  相当于Socket服务端
 * @projectName noidemo
 * @description:
 * @date 2019/9/1215:39
 */
public class ServerSocketChannelDemo {
    public static void main(String[] args) throws IOException {

        // 创建服务端，绑定2223端口  同样也可以设置非阻塞模式
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.socket().bind(new InetSocketAddress("127.0.0.1", 2223));
        ByteBuffer buffer = ByteBuffer.allocate(20);

        while (true) {
            SocketChannel accept = channel.accept();
            if (accept != null) {
                System.out.println(accept.getRemoteAddress());

                accept.read(buffer);
                buffer.flip();
                byte[] byteArray = buffer.array();
                for (int i = 0; i < byteArray.length; i++) {
                    System.out.println((char) byteArray[i]);
                }
            }


        }


    }

}
