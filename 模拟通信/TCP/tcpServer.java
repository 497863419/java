package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Name：模拟通信服务器端
 * @Author：ZYJ
 * @Date：2019-07-22-14:26
 * @Description:
 */
public class tcpServer {
    public static void main(String[] args) throws IOException {
        //1，创建服务器对象ServerSocket和系统要指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        //2，使用ServerSocket对象中的accept()方法，获取到请求的客户端Socket对象；
        Socket socket = serverSocket.accept();
        //3，使用Socket对象中的getInputStream（）获取网络字节输入流InputStream；
        InputStream is = socket.getInputStream();
        //4，使用网络字节输入流InputStream对象的read（）方法读取客户端发送的数据；
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String result = new String(bytes,0,len);
        System.out.println(result);
        //5，使用Socket对象中的getOutputStream（）获取网络字节输出流outputStream;
        OutputStream os = socket.getOutputStream();
        //6，使用网络字节输出流outputStream对象中的write（）给客户端回写数据
        os.write("你好啊，客户端".getBytes());
        //7，释放资源
        socket.close();
        serverSocket.close();

    }
}
