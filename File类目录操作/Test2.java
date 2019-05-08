package JAVASE.IOtext;

import java.io.File;
import java.io.IOException;

/**
 * @Name：java目录操作
 * @Author：ZYJ
 * @Date：2019-05-08-16:03
 * @Description:
 */
public class Test2 {
    public static void main(String[] args)throws IOException {
        File file = new File("C:\\Users\\ZYJ\\Desktop\\javaIO\\ioTest\\test.java");
        //进行父路径判断
        if(!file.getParentFile().exists()){//若父路径不存在
            //创建父路径
            file.getParentFile().mkdirs();
        }
        if(file.exists()){//若文件存在
            file.delete();
        }else {
            file.createNewFile();
        }
    }
}

