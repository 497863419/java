package ThreadTest.SleepTest;

/**
 * @Name：线程休眠
 * @Author：ZYJ
 * @Date：2019-05-28-22:57
 * @Description:
 */
public class sleepDemo {
    public static void main(String[] args) {
        ThreadDemo threadDemo =new ThreadDemo();
        new Thread(threadDemo).start();
        new Thread(threadDemo).start();
        new Thread(threadDemo).start();
    }
}
class ThreadDemo implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程"+Thread.currentThread().getName()+",i="+i);
        }
    }
}
