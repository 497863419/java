package PrCoSTest;

/**
 * @Name：  生产消费者模型  ：多生产与多消费
 * @Author：ZYJ
 * @Date：2019-06-11-11:37
 * @Description:    模拟线程间通信
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class PrCosDemo {
    public static void main(String[] args) {
        Goods goods = new Goods();
        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Producer producer = new Producer(goods);
            Thread produceThread = new Thread(producer);
            produceThread.setName("生产者线程"+i);
            threadList.add(produceThread);
        }
        for(int i=0;i<6;i++){
            Consumer consumer = new Consumer(goods);
            Thread consumerThread = new Thread(consumer);
            consumerThread.setName("消费者线程"+i);
            threadList.add(consumerThread);
        }
        for(Thread thread : threadList){
            thread.start();
        }
    }
}

/**
 * 资源类 ：
 *   设置资源属性与状态
 *   创建生产与消费方法
 */
class Goods{
    private  String goodsName;
    private int count;

    /**
     * 生产方法
     * @param goodsName
     */
    public synchronized void set(String goodsName) throws InterruptedException {
        //有商品 等待消费
        while (this.count>0){
            wait();
        }
        this.goodsName=goodsName;
        this.count=count+1;
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("生产"+toString());
        System.out.println("=========================");
        //生产完毕 唤醒消费者线程
        notifyAll();
    }

    /**
     * 消费方法
     */
    public synchronized void get() throws InterruptedException {
        //当没有资源时
        while (this.count==0){
            //等待
            wait();
        }
        //有资源消费
        this.count=this.count-1;
        Thread.sleep(1000);//模拟网络延迟
        System.out.println(Thread.currentThread().getName());
        System.out.println("消费"+toString());
        System.out.println("===================");
        //消费完毕，唤醒生产者线程生产
        notifyAll();
    }

    //覆写toString()方法
    @Override
    public  String toString(){
        return "Goods["+goodsName+",库存为："+count+"]";
    }

}

/**
 * 生产者线程
 */
class Producer implements Runnable{
    private Goods goods;

    Producer(Goods goods) {
        super();
        this.goods = goods;
    }

    //设置线程任务
    @Override
    public void run() {
        while (true){
            try {
                //调用生产方法
                this.goods.set("mac一台");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 消费者线程
 */
class Consumer implements Runnable{
    private  Goods goods;

    Consumer(Goods goods) {
        super();
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.goods.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
