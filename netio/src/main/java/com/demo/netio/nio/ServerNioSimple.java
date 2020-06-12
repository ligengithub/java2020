package com.demo.netio.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

/**
 * @author ligen
 * @title: ServerNioSimple
 * @projectName java
 * @description:
 * @date 2020/5/2520:02
 */
public class ServerNioSimple {

    public static void main(String[] args) {

        try {
            ServerSocketChannel channel = ServerSocketChannel.open();

            channel.configureBlocking(false);
            ServerSocketChannel ch = channel.bind(new InetSocketAddress("127.0.0.1", 8083));


            ArrayList<SocketChannel> socketChannels = new ArrayList<>();

            final ByteBuffer[] byteBuffers = new ByteBuffer[1024];

            while (true) {

                SocketChannel accept = ch.accept();
                if (accept != null) {
                    socketChannels.add(accept);
                }

                socketChannels.forEach(s -> {
                    try {
                        s.configureBlocking(false);
                        long read = s.read(byteBuffers);
                        if (read!=-1){
                            byteBuffers.a
                            System.out.println(byteBuffers);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
