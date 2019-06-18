package FixedThreadPoolTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Name： FixedThreadPool的使用
 * @Author：ZYJ
 * @Date：2019-06-18-19:38
 * @Description:
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        RunnableImpl runnable = new RunnableImpl();

        for(int i=0;i<5;i++){
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }

}
class RunnableImpl implements Runnable{

    @Override
    public void run() {
       for(int j=0;j<10;j++){
           System.out.println(Thread.currentThread().getName()+"执行任务");
       }
    }
}