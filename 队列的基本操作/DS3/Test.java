package DS3;
interface IMyQueue {
    // 判断这个队列是否为空
    boolean empty();
    // 返回队首元素，但不出队列
    int peek();
    // 返回队首元素，并且出队列
    int poll();
    // 将 item 放入队列中
    void add(int item);
    // 返回元素个数
    int size();
}

class IMyQueueImpl implements IMyQueue{
    private Node fornt;//队列头
    private Node rear;//队尾
    private int usedSize;

    class Node {//链表
        private int data;
        private Node next;
        public Node(int data){//构造方法
            this.data=data;
        }
    }
    public IMyQueueImpl(){//构造方法
        this.fornt=null;
        this.rear=null;
        this.usedSize=0;

    }


    // 判断这个队列是否为空
    public boolean empty(){
        if(usedSize==0){
            return true;
        }else return  false;

    }
    // 返回队首元素，但不出队列
    public int peek(){
        if(empty()){
            throw  new UnsupportedOperationException("队列为空");
        }
        return  this.fornt.data;

    }
    // 返回队首元素，并且出队列
    public int poll(){
        if(empty()){
            throw  new UnsupportedOperationException("队列为空");
        }
        int data= this.fornt.data;//保存队首元素
        this.fornt = this.fornt.next;
        this.usedSize--;
        return  data;

    }
    // 将 item 放入队列中
    public void add(int item){
        Node node =new Node(item);//
        if(empty()){
            this.fornt=node;
            this.rear=node;
            usedSize++;
        }else{
            this.rear.next= node;
            this.rear=node;
            usedSize++;
        }

    }
    // 返回元素个数
   public int size(){
        return  usedSize;
    }

}

public class Test {
    public static void main(String[] args) {
        IMyQueueImpl iMyQueue = new IMyQueueImpl();
        iMyQueue.add(32);
        iMyQueue.add(38);
        iMyQueue.add(72);
        iMyQueue.add(62);
        System.out.println(iMyQueue.size());
        System.out.println(iMyQueue.poll());
        System.out.println(iMyQueue.peek());
        System.out.println(iMyQueue.size());

    }

}
