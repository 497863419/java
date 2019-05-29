package ThreadTest.MyThread;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-28-22:33
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        new myThread().start();
        new myThread().start();
        new myThread().start();
    }
}
class myThread extends Thread{
    private int ticket =10;
    public void run(){
        while(this.ticket>0){
            System.out.println("剩余票数"+this.ticket--);
        }
    }
}
