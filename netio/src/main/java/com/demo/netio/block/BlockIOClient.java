package com.demo.netio.block;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ligen
 * @title: BlockIOClient
 * @projectName java
 * @description:
 * @date 2020/5/513:28
 */
public class BlockIOClient {

    public void connectToServer() throws IOException {
        new Thread(new ClienTask()).start();

    }


    /**
     * @ desc : 客户端任务
     * @ params
     * @ return
     * @ date 2020/5/6
     * @ author ligen
     */
    class ClienTask implements Runnable {
        public void run() {
            Socket socket = null;
            OutputStream outputStream = null;
            InputStream inputStream = null;
            try {
                socket = new Socket("127.0.0.1", 8083);
                if (socket != null) {
                    outputStream = socket.getOutputStream();
//                while (true) {
                    outputStream.write("12341234123412341234".getBytes());
                    inputStream = socket.getInputStream();
                    byte[] bytes = new byte[1024];
                    int read;
                    if ((read = inputStream.read(bytes)) != -1) {
                        System.out.println("返回数据:" + new String(bytes, 0, read) + "当前客户端:" + socket.getLocalSocketAddress());
                    }
                    Thread.currentThread().sleep(2000);
//                }


                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            catch (InterruptedException e) {
                System.out.println("线程被唤醒");
                e.printStackTrace();
            }
            finally {
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream!=null){
                        outputStream.close();
                    }
//            socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
