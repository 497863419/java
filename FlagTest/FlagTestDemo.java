package ThreadTest.FlagTest;

/**
 * @Name：线程停止
 * @Author：ZYJ
 * @Date：2019-05-29-10:22
 * @Description:
 */
public class FlagTestDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread1= new Thread(myThread,"子线程A");
        thread1.start();
        Thread.sleep(2000);
        myThread.setFlag(false);
        System.out.println("program over");
    }
}
class MyThread implements Runnable{
    //定义标记类
    private boolean flag =true;
    @Override
    public void run() {
        int i=1;
        while(flag){
            try {
                Thread.sleep(1000);
                System.out.println("第"+i+"次执行,线程名称为"+Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //设置标记
    public void setFlag(boolean flag){
        this.flag=flag;
    }
}