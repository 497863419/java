package ThreadTest.ThreadExtends;

/**
 * @Name： 线程的优先级问题。
 * @Author：ZYJ
 * @Date：2019-05-29-14:21
 * @Description:   优先级的继承性
 */
class A implements Runnable{

    @Override
    public void run() {
        System.out.println("A的优先级："+Thread.currentThread().getPriority());
        Thread thread = new Thread(new B());
        thread.start();
    }
}
class B implements Runnable{

    @Override
    public void run() {
        System.out.println("B的优先级："+Thread.currentThread().getPriority());
    }
}
public class ThreadExtendsDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new A());
        //将A线程的优先级设置为最高优先级
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
