package com.demo.netio.nio.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author ligen
 * @title: nio.ChannelTrans
 * @projectName noidemo
 * @description: FileChannel的数据发送接收
 * @date 2019/9/129:31
 */
public class ChannelTrans {

    public static void main(String[] args) throws IOException {
    /**
     * @说明: nio.FileChannelDemo
     * 两个Channel中只要有一个是FileChannel，那么就可以直接将一个Channel中的数据转移到另一个Channel中，因为FileChannel由两个方法
     * transferTo（）和transferForm() 方法。
     *
     * 2个注意点：
     *  1 如果你要获取100个字节的内容，如果你的剩余可用Buffer，或者源Buffer可以读取的小于100.那么，都只会读取到实际长度的内容。
     *  2 SocketChannel 中
     */
        RandomAccessFile formFile = new RandomAccessFile("formFile.txt","rw");
        RandomAccessFile toFile = new RandomAccessFile("toFile.txt","rw");

        FileChannel formChannel = formFile.getChannel();
        FileChannel toChannel = toFile.getChannel();

        formChannel.transferFrom(toChannel,2,3);

        ByteBuffer buffer = ByteBuffer.allocate(50);

        formChannel.read(buffer);
        System.out.println("buffer");


    }

}
