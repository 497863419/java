package JAVASE.io;

import java.io.File;

/**
 * @Name：递归打印当前目录下所有层级文件信息
 * @Author：ZYJ
 * @Date：2019-05-07-20:02
 * @Description:  列举当前路径下的所有文件，若碰到文件夹继续进入遍历
 * 运用方法  listFiles()  思想：递归
 */
public class ioClass {
    //   C:\Users\ZYJ\Desktop\JavaSE全套课件
    public static void main(String[] args) {
        File file = new File("C:\\Users\\ZYJ\\Desktop\\JavaSE全套课件");
        long start = System.currentTimeMillis();
        listAllFiles(file);
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start));
    }

    public static void listAllFiles(File file) {
        if (file.isDirectory()) {//若为目录
            File[] result = file.listFiles();//列取信息
            if (result != null) {
                for (File file1 : result) {//遍历  打印
                    listAllFiles(file1);
                }
            }
        }else {
            System.out.println(file);//直接打印
        }
    }
}
