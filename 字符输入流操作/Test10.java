package JAVASE.IOtext;

import java.io.*;

/**
 * @Name：字符输入流
 * @Author：ZYJ
 * @Date：2019-05-15-17:26
 * @Description:  读取文件中的内容输出在终端
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        //1.获取终端流
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
        if(file.exists()){
            //2.获取输入流
            Reader in = new FileReader(file);
            char[] data = new char[1024];
            //3.读取数据
            int len = in.read(data);
            String result = new String(data,0,len);
            System.out.println(result);
            //4.关闭流
            in.close();
        }
    }
}
