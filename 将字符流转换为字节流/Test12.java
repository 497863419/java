package JAVASE.IOtext;

import java.io.*;

/**
 * @Name：将字符流转换为字节流
 * @Author：ZYJ
 * @Date：2019-05-15-20:10
 * @Description:
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        String str ="hello";
        //字符串传入字符输入流中
        InputStream in = new ByteArrayInputStream(str.getBytes());
        //实例化字符输出流
        OutputStream out = new ByteArrayOutputStream();
        int len=0;
        //读取字符串
        while((len=in.read())!=-1){
            out.write(Character.toUpperCase(len));
        }
        System.out.println(out);
        in.close();
        out.close();
    }

}
