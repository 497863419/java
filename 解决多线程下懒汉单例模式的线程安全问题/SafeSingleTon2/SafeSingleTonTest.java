package SafeSingleTon2;

/**
 * @Name： 解决多线程下懒汉单例模式的线程安全问题
 * @Author：ZYJ
 * @Date：2019-07-26-12:25
 * @Description: 方法二: 使用synchronized同步代码块
 */
public class SafeSingleTonTest {
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

class SingleTon {
    private static SingleTon singleton;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        try {
            Thread.sleep(1000);
            if (singleton == null) {
                synchronized (SingleTon.class) {
                    if (singleton==null) {
                        singleton = new SingleTon();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(SingleTon.getInstance().hashCode());
    }
}
