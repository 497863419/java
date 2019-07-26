package SingleTonTest;

/**
 * @Name： 单例模式
 * @Author：ZYJ
 * @Date：2019-07-26-11:45
 * @Description:
 */
public class Singleton {
    private static  Singleton singleton;
    private Singleton(){}
    public static  Singleton getInstance(){
        if(singleton==null){
            try {
                Thread.sleep(1000);
                singleton=new Singleton();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return singleton;
    }

    public static void main(String[] args) {
        MyThread myThread =new MyThread();
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
        System.out.println(Singleton.getInstance().hashCode());
    }
}

