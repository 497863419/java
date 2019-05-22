package JAVASE.IOtext;

import java.util.Scanner;

/**
 * @Name：Scanner类练习
 * @Author：ZYJ
 * @Date：2019-05-22-11:22
 * @Description: 利用正则表达式进行判断
 */
public class TestPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生日：");
        if(scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")){
            //取得指定输入流，并将其转化为字符串
            String birthday = scanner.next();
            System.out.println("输入的生日为："+birthday);

        }else{
            System.out.println("输入格式非法，不是生日！！！");
        }
        //关闭流

        scanner.close();
    }
}
