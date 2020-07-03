package com.demo.netio.nio.file;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FirstDemo {

    /**
     *@ desc : 简单的用法 常用的 方法。
     *@ params
     *@ return
     *@ date 2019/9/10
     */


    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("File.txt", "rwd");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(48);
        int byteRead = channel.read(buffer);  // 写buffer
//        buffer.rewind()   // 重读
         while (byteRead != -1) {
            System.out.print((char) buffer.get());
            buffer.flip(); //将写模式切换为读模式，将position设置为0 ，limit 设置为之前的position
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();  // 清空buffer
//             buffer.compact() // 清空已读buffer
//             buffer.mark();  // 标记一个位置position
//             buffer.reset();  // 恢复到这个position
            byteRead = channel.read(buffer);
        }
        file.close();
    }
}
