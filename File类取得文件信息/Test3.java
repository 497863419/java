package JAVASE.IOtext;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @Name：取得文件信息
 * @Author：ZYJ
 * @Date：2019-05-08-16:43
 * @Description:
 */
public class Test3 {
    public static void main(String[] args) throws IOException {

        Date date1= new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String result = simpleDateFormat.format(date1);
        File file = new File("C:\\Users\\ZYJ\\Desktop\\QQ截图20190403191453.png");
        if(file.exists()&&file.isFile()){//保证文件存在并且是个文件
            System.out.println("文件大小"+file.length());
            System.out.println("最后修改时间为："+result);
        }
    }
}
