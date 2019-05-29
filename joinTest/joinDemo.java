package ThreadTest.joinTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Name：join（）练习
 * @Author：ZYJ
 * @Date：2019-05-28-23:32
 * @Description:
 */
public class joinDemo {
    public static void main(String[] args) throws InterruptedException {
        myThread mythread = new myThread();
        Thread thread = new Thread(mythread,"子线程A");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        //主线程调用线程等待
        thread.join();
        System.out.println("代码结束");
    }
    public static void printTime(){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-mm-dd  hh:mm:ss");
        String time = format.format(date);
        System.out.println(time);
    }
}
class myThread implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("主线程睡眠前时间");
            joinDemo.printTime();
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
            System.out.println("睡眠时间结束");
            joinDemo.printTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
