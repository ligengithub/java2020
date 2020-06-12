package com.demo.netio.block;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ligen
 * @title: BlockIOServer
 * @projectName java
 * @description:
 * @date 2020/5/513:08
 */
public class BlockIOServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Socket accept = null;
        try {
            serverSocket = new ServerSocket(3000);
            while (true) {
                accept = serverSocket.accept();
                System.out.println("客户端连接成功，客户端:" + accept.getRemoteSocketAddress());
                new Thread(new ServerThread(accept)).start();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            accept.close();
            serverSocket.close();
        }
    }


    /**
     * @ desc : serverSocket 处理客户端的连接
     * @ params
     * @ return
     * @ date 2020/5/6
     * @ author ligen
     */
    static class ServerThread implements Runnable {
        private Socket socket;
        OutputStream outputStream;
        InputStream inputStream;

        public ServerThread(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            byte[] bytes = new byte[1024];
            try {
                inputStream = socket.getInputStream();
                int read;
                while ((read = inputStream.read(bytes)) != -1) {
                    System.out.println("服务线程:" + Thread.currentThread() + "收到的数据是:" + new String(bytes, 0, read));
                    outputStream = socket.getOutputStream();
                    // 回复客户端
                    outputStream.write(new String(bytes, 0, read).getBytes());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    outputStream.close();
                    inputStream.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
