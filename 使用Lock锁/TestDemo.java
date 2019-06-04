package ThreadClass.LockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Name：   Lock锁
 * @Author：ZYJ
 * @Date：2019-06-03-20:03
 * @Description:  使用lock锁实现锁，解决线程安全问题
 */
public class TestDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class MyThread implements Runnable {
    private int tick = 100;
    //1.在成员位置创建一个ReentrantLock对象；
    private Lock ticketLock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //2.在可能出现安全问题的代码前调用lock()
            ticketLock.lock();
            try {
                if (this.tick > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "还有" + this.tick-- + "张票");
                }
            }finally {
                //3.在可能出现安全问题的代码后调用unlock()
                //将unlock()语句放在finally代码块中 无论是否出现安全问题，都会释放锁。
                ticketLock.unlock();
            }

        }
    }
}
