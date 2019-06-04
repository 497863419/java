package ThreadClass.DeadLock;

/**
 * @Name：  模拟死锁
 * @Author：ZYJ
 * @Date：2019-06-03-20:27
 * @Description:
 */
public class TestDemo {
    private  static Pen pen = new Pen();
    private  static  Book book =new Book();

    public static void main(String[] args) {
        new TestDemo().deadLock();
    }
    public void deadLock(){
        //使用匿名
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (pen){
                    System.out.println(Thread.currentThread()+"：我有笔，我就不给你");
                    synchronized (book){
                        System.out.println(Thread.currentThread()+"：把你的本给我！");
                    }
                }
            }
        },"Pen").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (book){
                    System.out.println(Thread.currentThread()+"：我有本子，我就不给你！");
                    synchronized (pen){
                        System.out.println(Thread.currentThread()+"：把你的笔给给我");
                    }
                }
            }
        },"Book").start();
    }
}
class Pen{
    private String pen="笔";

    public String getPen() {
        return pen;
    }
}
class Book{
    private  String book="书";

    public String getBook() {
        return book;
    }
}
