package SafeSingleTon4;

/**
 * @Name：  解决多线程下懒汉单例模式的线程安全问题
 * @Author：ZYJ
 * @Date：2019-07-26-13:32
 * @Description:    第四种：使用静态内部类来实现单例模式
 */
public class SingleTon {
    private static class SingletonHandler{
        private static SingleTon singleTon = new SingleTon();
    }
    private  SingleTon(){}
    public static SingleTon getInstance(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SingletonHandler.singleTon;
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

