package JAVASE.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-17-19:40
 * @Description:
 */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\java.txt");
        PrintStream printStream = new PrintStream(new FileOutputStream(file));
        printStream.print("姓名：");
        printStream.println("Amanda");
        printStream.print("年龄:");
        printStream.println(21);
        printStream.close();

    }
}
