package ThreadTest.yieldTest;

/**
 * @Name：线程让步
 * @Author：ZYJ
 * @Date：2019-05-28-23:08
 * @Description:
 */
public class yieldDemo {
    public static void main(String[] args) {
       mynewThread mynewThread1 =new mynewThread();
        new Thread(mynewThread1).start();
        new Thread(mynewThread1).start();
        new Thread(mynewThread1).start();
    }
}
class mynewThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            Thread.yield();
            System.out.println("当前线程为"+Thread.currentThread().getName()+",i="+i);
        }
    }
}
