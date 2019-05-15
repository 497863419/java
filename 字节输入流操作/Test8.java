package JAVASE.IOtext;

import java.io.*;

/**
 * @Name：字节输入流操作
 * @Author：ZYJ
 * @Date：2019-05-15-16:03
 * @Description:
 */
public class Test8 {
    public static void main(String[] args) {
        //1.定义文件路径
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
        //保证文件存在
        if(file.exists()){
            try {
                //输入流接收文件
                InputStream input = new FileInputStream(file);
                //定义字节数组
                byte[] data = new byte[1024];
                //输入流文件调用read() 方法读取文件中内容，传入至data参数中  长度用len接收
                //返回-1 说明读取完成
                int len = input.read(data);
                //将字节数组的内容转为字符串 此处使用构造方法参数分别为  源数据 ，起始位置，结束位置
                String result = new String(data,0,len);
                System.out.println(result);
                //关闭流
                input.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
