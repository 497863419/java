package JAVASE.IOtext;

import java.io.File;
import java.io.IOException;

/**
 * @Name：创建文件基本操作
 * @Author：ZYJ
 * @Date：2019-05-08-15:03
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ZYJ\\Desktop\\text.java");
       if(file.exists()){
           file.delete();
       }else {
           file.createNewFile();
       }

    }
}
