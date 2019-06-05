package ThreadTest.dengerRunnable;

/**
 * @Name：模拟线程安全问题
 * @Author：ZYJ
 * @Date：2019-06-03-16:39
 * @Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        myThread mythread = new myThread();
        Thread thread1 = new Thread(mythread);
        Thread thread2 = new Thread(mythread);
        Thread thread3 = new Thread(mythread);
        thread1.start();
        thread2.start();
        thread3.start();
    }


}
class myThread implements Runnable{
    private  int ticket=100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+
                        "正在买票，还剩"+ticket--+"张票");
            }
        }
    }
}