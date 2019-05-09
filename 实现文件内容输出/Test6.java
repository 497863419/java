package JAVASE.IOtext;

import java.io.*;

/**
 * @Name： 实现文件内容的输出
 * @Author：ZYJ
 * @Date：2019-05-09-16:48
 * @Description: 使用OutputStream 类
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        //1.取得终端对象
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
        if(!file.getParentFile().exists()){//判断父路径是否存在
            file.getParentFile().mkdirs();//若不存在 创建目录
        }
        //2.取得相应终端输出流
        OutputStream output = new FileOutputStream(file);//子类向上转型
        String msg ="hello world!";
        //3.将数据通过输出流输出
        output.write(msg.getBytes());//getBytes() 转为字节数组 write() 接收数组类型
        //4.关闭流
        output.close();
    }
}
