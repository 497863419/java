package PuCuDemo;

/**
 * @Name： 生产消费者模型
 * @Author：ZYJ
 * @Date：2019-06-05-20:24
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Thread produceThread = new Thread(new Producer(goods),"生产者线程");
        Thread consumerThread= new Thread(new Consumer(goods),"消费者线程");
        consumerThread.start();
        produceThread.start();
    }
}

/**
 * 商品类
 */
class Goods{
    //商品名称
    private String goodsName;
    //商品数量
    private int count;

    /**
     * 生产方法 由消费者线程唤醒。
     * @param goodsName
     * @throws InterruptedException
     */
    public synchronized void set(String goodsName) throws InterruptedException {
        //若有商品
        if(this.count>0){
            System.out.println("还有库存等待消费者购买");
            wait();
        }
        //若此时没有商品
        this.goodsName=goodsName;
        this.count=count+1;
        Thread.sleep(1000);
        System.out.println("生产"+toString());
        //通知消费者线程可以消费
        notify();
    }

    /**
     * 消费方法  由生产者线程唤醒
     * @throws InterruptedException
     */
    public synchronized void get() throws InterruptedException {
        //如果没有商品
        if(count==0){
            System.out.println("没有商品了，等待生产。。。");
            wait();
        }
        this.count=this.count-1;
        Thread.sleep(1000);
        System.out.println("消费"+toString());
        //消费后通知生产者线程可以进行生产
        notify();
    }

    @Override
    public String toString(){
        return "Good[goodsName="+goodsName+",库存为"+count+"]";
    }

}

/**
 * 生产者类
 */
class Producer implements Runnable{
    private  Goods goods;
    public Producer(Goods goods){
        super();
        this.goods=goods;
    }


    @Override
    public void run() {
        try {
            this.goods.set("大众汽车CC一辆");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


/**
 * 消费者类
 */
class Consumer implements Runnable{
    private  Goods goods;
    public Consumer(Goods goods){
        super();
        this.goods=goods;
    }
    @Override
    public void run() {
        try {
            this.goods.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

