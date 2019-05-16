package JAVASE.IOtext;

import java.io.*;

/**
 * @Name：将字节流转换为字符流
 * @Author：ZYJ
 * @Date：2019-05-15-19:46
 * @Description:
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        //1.  获取终端流
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
        //过去字节输出流
        OutputStream output = new FileOutputStream(file);
        //将字节输出流转为字符输出流
        Writer out = new OutputStreamWriter(output);
        String msg = "hello  java";
        // 将字符串写入至程序中
        out.write(msg);
        out.close();
    }
}
