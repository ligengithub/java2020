package com.demo.netio.nio.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author ligen
 * @title: nio.FileChannelDemo
 * @projectName noidemo
 * @description:
 * @date 2019/9/1213:38
 */
public class FileChannelDemo {

    /**
     * @说明: FileChannel  是一个连接到文件的通道，，文件读写，它总是阻塞的运行
     * <p>
     * 模拟一个文件的拷贝
     */

    public static void main(String[] args) throws IOException {


        // 源文件
        RandomAccessFile fileS = new RandomAccessFile("FileChannelTest1.txt", "rw");
        FileChannel channelS = fileS.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(3);

        // 目标文件
        RandomAccessFile fileT = new RandomAccessFile("FileChannelTest.txt", "rw");
        FileChannel channel = fileT.getChannel();

        while (channelS.read(buffer) != -1) {

//            channelS.read(buffer);

            buffer.flip();   // 为什么要有flip ，将读模式切换到写模式以后 position 置为0  limit置为之前的position

            // write(src,position) 不指定position默认从头写。
//            channel.write(buffer,channel.size());
            channel.write(buffer);
            // 将数据从内存更新到磁盘
            channel.force(true);
//            清空buffer
            /**
             * @说明: clear 清空   compect 清空已读
             */
            buffer.clear();

            /**
             * @说明:其它方法
             *
             * truncate() 截取
             */
//            channel.truncate(4);
            long size = channel.size();
            System.out.println(size);


        }
        channel.close();
        channelS.close();


//        ByteBuffer buffer = ByteBuffer.allocate(5);


    }
}
