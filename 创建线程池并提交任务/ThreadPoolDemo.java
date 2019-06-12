package ThreadPoolTest;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Name：创建线程池，并提交任务
 * @Author：ZYJ
 * @Date：2019-06-12-21:18
 * @Description:
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,5,2000,
                TimeUnit.MILLISECONDS,  new LinkedBlockingDeque<Runnable>());
        for(int i=0;i<5;i++){
            threadPoolExecutor.execute(runnableThread);
        }
    }
}
class RunnableThread implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+","+i);
        }
    }
}
