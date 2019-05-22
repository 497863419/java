package JAVASE.IOtext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @Name： 使用Scanner类操作 文件
 * @Author：ZYJ
 * @Date：2019-05-22-16:06
 * @Description:  熟悉Scanner类的 hasNext() nex
 */
public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        //取得操作文件
       File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\hello.txt");
       //获取输入流
       InputStream in = new FileInputStream(file);
       //实例化Scanner类
       Scanner scanner = new Scanner(in);
       //自定义分隔符
       scanner.useDelimiter("\n");
       while (scanner.hasNext()){
           System.out.println(scanner.next());
       }
       //关闭流
       scanner.close();
    }

}
