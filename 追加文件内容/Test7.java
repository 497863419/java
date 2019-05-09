package JAVASE.IOtext;

import java.io.*;

/**
 * @Name： 追加文件内容
 * @Author：ZYJ
 * @Date：2019-05-09-17:33
 * @Description: ；使用FileOutputstream(Flie file,boolean append)
 */
public class Test7 {
    public static void main(String[] args) throws Exception {
        //1.获取终端对象
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        //2.实例化父类对象
        OutputStream outputStream = new FileOutputStream(file,true);
        String msg=" hello java!";
        //3.数据写入或读取
        outputStream.write(msg.getBytes());
        //4.关闭流
        outputStream.close();

    }
}
