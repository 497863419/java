package SafeSingleTon3;


/**
 * @Name： 解决多线程下懒汉单例模式的线程安全问题
 * @Author：ZYJ
 * @Date：2019-07-26-12:45
 * @Description:方法三：双重加锁问题
 */
public class SafeSingleTonTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 =new Thread(myThread);
        Thread thread2 =new Thread(myThread);
        Thread thread3 =new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class SingleTon {
    private static volatile SingleTon singleTon;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                if (singleTon == null) {
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;

    }
}
class MyThread  implements  Runnable{

    @Override
    public void run() {
        System.out.println(SingleTon.getInstance().hashCode());
    }
}
