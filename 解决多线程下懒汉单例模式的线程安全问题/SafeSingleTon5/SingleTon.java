package SafeSingleTon5;

/**
 * @Name：  解决多线程下懒汉单例模式的线程安全问题
 * @Author：ZYJ
 * @Date：2019-07-26-13:52
 * @Description: 第五种 static 代码块来实现单例模式
 */
public class SingleTon {
    private  static  SingleTon singleTon;
    private SingleTon(){}

    /**
     * 静态代码块
     */
    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        singleTon = new SingleTon();
    }
    public static SingleTon getInstance(){
        return singleTon;
    }

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
class MyThread implements  Runnable{

    @Override
    public void run() {
        System.out.println(SingleTon.getInstance().hashCode());
    }
}
