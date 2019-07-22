package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Name： 模拟通信 客户端
 * @Author：ZYJ
 * @Date：2019-07-22-13:53
 * @Description:
 */
public class tcpClient {
    public static void main(String[] args) throws IOException {
        //1，创建客户端对象Socket，构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        // 2，使用Socket对象中的方法getOutputStream（）获取网络输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //3，使用OutputStream对象中的write（）方法，给服务器发送数据
        os.write("你好呀服务器".getBytes());
       // 4，使用Socket对象中的方法getInputStream（）获取网络输入流InputStream对象
        InputStream is = socket.getInputStream();
        // 5，使用InputStream对象中的read（）方法读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String result = new String(bytes,0,len);
        System.out.println(result);
        //6，释放资源
        socket.close();
    }
}
