package com.demo.netio.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * @author ligen
 * @title: nio.PipeDemo
 * @projectName niodemo
 * @description:
 * @date 2019/9/1216:32
 */
public class PipeDemo {
    /**
     * @说明: Pipe 用于两个线程之间通信，
     * Pipe里面有两个Channel  一个Sink  一个Sources ，通信是单向的，从Sink写入，从Sources读取
     * <p>
     * 比如A线程要传递数据给线程B   那么A 先把数据写到Sink里面，然后线程B从Sources里面取
     */
//    public static ByteBuffer buffer;
    public static void main(String[] args) throws IOException {

        // 创建Pipe管道
        Pipe pipe = Pipe.open();
//        pipe 的sink
        Pipe.SinkChannel sink = pipe.sink();
//        pipe 的source
        Pipe.SourceChannel source = pipe.source();
        ByteBuffer buffer = ByteBuffer.allocate(20);

        Thread threadA = new Thread(() -> {
            while (true){
                buffer.put(" thread".getBytes());
                buffer.flip();
                try {
                    while (buffer.hasRemaining()) {
                        sink.write(buffer);
                    }
                    buffer.clear();
                    System.out.println(Thread.currentThread().getName()+"发送数据");
                    Thread.sleep(2000);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        });


        Thread threadB = new Thread(() -> {
            while (true) {
                try {
                    buffer.clear();
                  if ( source.read(buffer)!=-1){
                      buffer.flip();
                      String data = new String(buffer.array());
//                    for (int i = 0; i < array.length; i++) {
                      System.out.println(Thread.currentThread().getName()+"data:  "+data);
//                    }
//                    System.out.println(Thread.currentThread().getName()+"data :"+);
                      Thread.sleep(2000);
                  }

                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        threadA.start();

        threadB.start();


    }


}
