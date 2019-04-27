
public class TestMain {
    public static void main(String[] args) {
        MyQueueImpl myQueue = new MyQueueImpl();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println(myQueue.poll());//10
        System.out.println(myQueue.peek());//20
        System.out.println(myQueue.size());//4
    }
    public static void main1(String[] args) {
        MyStackImpl myStack = new MyStackImpl();
        myStack.push(10);
        myStack.push(99);
        myStack.push(21);
        myStack.push(77);
        System.out.println(myStack.pop());//77
        System.out.println(myStack.peek());//21
        System.out.println(myStack.size());//3
    }
}
