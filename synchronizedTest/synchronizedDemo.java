package ThreadTest.synchronizedTest;

/**
 * @Name：  同步处理  使用同步代码块
 * @Author：ZYJ
 * @Date：2019-05-29-15:02
 * @Description:
 */
public class synchronizedDemo {
    public static void main(String[] args) {
        MyThread myThead = new MyThread();
        Thread t1 = new Thread(myThead,"黄牛A");
        Thread t2 = new Thread(myThead,"黄牛B");
        Thread t3 = new Thread(myThead,"黄牛C");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread implements Runnable{
    private int ticket =30;
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            //在同一时刻，只允许一个线程进入代码块处理
            synchronized (this){
                if(this.ticket>0){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+
                            ",还有"+this.ticket--+"张票");
                }
            }
        }
    }
}
