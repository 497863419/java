package ThreadTest.PriorityTest;

/**
 * @Name：设置优先级
 * @Author：ZYJ
 * @Date：2019-05-29-14:11
 * @Description:
 */
public class PriorityDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("当前线程为"+Thread.currentThread().getName()+",i="+i);
        }
    }
}
