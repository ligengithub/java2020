package com.demo.netio.nio.tcp;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author ligen
 * @title: nio.SocketChannelDemo    相当于客户端
 * @projectName noidemo
 * @description:
 * @date 2019/9/1214:30
 */
public class SocketChannelDemo {

    public static void main(String[] args) throws IOException {

        SocketChannel channel = SocketChannel.open();
//        channel.configureBlocking(true);  设置非阻塞模式
        channel.connect(new InetSocketAddress("127.0.0.1", 1234));
//         channel.finishConnect();  非阻塞的时候，结果是异步返回，所以要使用这个函数检查是否连接完成


        RandomAccessFile file = new RandomAccessFile("SocketTest.txt", "rw");
        FileChannel fileChannel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(10);


        /**
         * @说明:发送数据
         */
        buffer.put("11111".getBytes());
        // 也是需要的。这个函数的功能 就2点，1 设置position    2 设置limit
        //        一般写完buffer，之后操作数据。。和读取到buffer，然后操作都需要加上这个函数。设置position
        buffer.flip();

        // hasRemaining()  是否还有数据在position和limit之间
        /**
         * 为什么要用hasRemaining 因为hasRemaining() ，因为write没有办法保证嫁给你buffer的数据全部写入Channel
         */
        while (buffer.hasRemaining()) {
            channel.write(buffer);
        }

        /**
         * @说明:接收数据
         */
        // 接收数据写到文件  连接断开的时候才会等于-1
        while (channel.read(buffer) != -1) {
            buffer.flip();
            fileChannel.write(buffer);
            fileChannel.force(true);
            buffer.compact();

        }
        fileChannel.close();
        System.out.println("----------");

    }

    /**
     * @说明:非阻塞模式
     *
     * 1 SocketChannel 可以设置非阻塞模式，这样connect write  read 方法就不会阻塞，但是为了确认操作执行的结果
     *
     * 1 connect 之后使用  connectFinished() 确认
     *
     * 2 send   使用hasRemaining
     * while (buffer.hasRemaining()) {
     *             channel.write(buffer);
     *         }
     *
     * 3 read 的话，检测返回值，会立即告诉你读取了多少字节
     *
     *
     */






}
