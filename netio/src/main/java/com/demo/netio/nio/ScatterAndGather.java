package com.demo.netio.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ desc : scatter 一个chanel分散到多个buffer
 * @ gather 多个buffer中读取到一个chanel
 * @ return
 * @ date 2019/9/11
 */

public class ScatterAndGather {

    public static void main(String[] args) throws IOException {
        // 一个channel读取到多个buffer
        /**
         * 注意 Scatter 是将多个buffer 作为一个数组然后作为Channel.read（）的参数，，当第一个Buffer读满了以后，会开始往第二个buffer里面写
         * 所以适用于，消息的每个部分长度相同的。用allocate，来限定每部分消息的长度，达到消息分组的目的。
         *
         * 不适用于： 消息各部分的长度不固定的消息。
         * */
        ByteBuffer bufferhead = ByteBuffer.allocate(50);
        ByteBuffer bufferbody = ByteBuffer.allocate(100);
        ByteBuffer[] arrBuf = {bufferhead, bufferbody};
        RandomAccessFile file = new RandomAccessFile("File.txt", "rwd");
        FileChannel channel = file.getChannel();
        channel.read(arrBuf);
        System.out.println("一个channel写入多个buffer");

        // 多个buffer写入一个channel

        /**
         * 多个buffer组成一个数组，然后将数组写入Channel中
         * 注意，调用buffer的flip以后，position的位置将变成头，limit变成原来的position。
         * 只有position到limit之间的数据会被写入buffer，即，buffer的容量为100，但是内容只有50，
         * 写入到Channel的时候只会写入这50个长度
         *
         * 适用于: 处理消息长度不固定的，当然也适用于处理消息长度固定的。
         * */
        bufferbody.flip();
        bufferhead.flip();
        ByteBuffer[] writebuf = {bufferbody, bufferhead};
        channel.write(writebuf);  // 写入到channel中


    }
}
