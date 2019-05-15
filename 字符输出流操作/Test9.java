package JAVASE.IOtext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Name：字符输出流使用
 * @Author：ZYJ
 * @Date：2019-05-15-17:01
 * @Description: 从程序像文件中写入内容
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        //1.取得终端对象
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");

        if(!(file.getParentFile().exists())){
            file.getParentFile().mkdirs();
        }
        String str = "哈哈哈哈哈！！！ ";
        //2.取得输出流
        Writer out = new FileWriter(file,true);
        //3.输出
        out.write(str);
        //4.关闭流
        out.close();

    }
}
