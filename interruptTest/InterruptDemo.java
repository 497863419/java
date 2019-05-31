package ThreadTest.interruptTest;

/**
 * @Name：interrupt（）方法练习
 * @Author：ZYJ
 * @Date：2019-05-29-10:55
 * @Description:
 */
public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread1= new Thread(myThread,"子线程A");
        thread1.start();
        Thread.sleep(3000);
        //掉用interrupt（）设置中断标志
        thread1.interrupt();
        System.out.println("代码结束！");
    }
}
class MyThread implements Runnable{
    private boolean flag =true;
    @Override
    public void run() {
        int i=1;
        while (flag){
            try {
                Thread.sleep(1000);//阻塞之后

                //currentThread()取得当前执行的线程对象

                boolean bool = Thread.currentThread().isInterrupted();
                //清除中断，抛出异常
                if(bool){
                    System.out.println("非阻塞情况下执行该操作。。。线程状态"+bool);
                    break;
                }
                System.out.println("第"+i+"次执行，线程名称为："+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                System.out.println("退出了");
                boolean bool = Thread.currentThread().isInterrupted();
                System.out.println(bool);
                return;
            }
        }
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }
}
