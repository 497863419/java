package JAVASE.IOtext;

import java.io.*;

/**
 * @Name：  文件拷贝
 * @Author：ZYJ
 * @Date：2019-05-16-17:31
 * @Description:字符流与字节流的使用
 */
public class Test13 {
    public static void main(String[] args) throws IOException {
        if(args.length!=2){
            System.out.println("非法操作！Java fileCopy 源文件路径 目标文件路径");
            return;
        }
        File sourceFile = new File(args[0]);
        File destFile = new File(args[1]);
        //输入流
        InputStream in = new FileInputStream(sourceFile);
        //输出流
        OutputStream out = new FileOutputStream(destFile);
        fileCopy(in,out);



    }
    private static void fileCopy(InputStream in, OutputStream out) throws IOException {
        System.out.println("----start-----");
        long start = System.currentTimeMillis();
        byte[] dates = new byte[1024];
        int len=0;
        while((len=in.read(dates))!=-1){
            out.write(dates,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-start)+"ms");
        System.out.println("----end----");
    }
}

