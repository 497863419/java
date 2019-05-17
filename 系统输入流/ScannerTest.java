package JAVASE.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-17-19:45
 * @Description:
 */
public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\java.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        //自定义分隔符
        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        scanner.close();

    }
}
