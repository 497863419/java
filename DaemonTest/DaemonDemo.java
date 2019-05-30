package ThreadTest.DaemonTest;

/**
 * @Name：观察守护线程
 * @Author：ZYJ
 * @Date：2019-05-29-14:33
 * @Description: 守护线程在所有线程执行结束后结束
 */
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new A(), "子线程A");
        //将线程A 设置为守护线程 ，此语句必须在start方法之前执行
        thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new A(), "子线程B");
        thread2.start();
        Thread.sleep(3000);
        //中断非守护线程
        thread2.interrupt();
        Thread.sleep(10000);
        System.out.println("代码结束");
    }
}

class A implements Runnable {
    private int i;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("线程名称" + Thread.currentThread().getName() +
                        ",i=" + i + "，是否为守护线程" + Thread.currentThread().isDaemon());
                Thread.sleep(1000);
             }
        } catch (InterruptedException e) {
            System.out.println("线程名称：" + Thread.currentThread().getName() + "线程中断");
        }
    }
}

