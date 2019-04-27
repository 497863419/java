
public class MyQueueImpl implements IMyQueue{
    class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    private Node front;//队列的头
    private Node rear;//队列的尾
    private int usedSize;

    public MyQueueImpl() {
        this.rear = null;
        this.front = null;
        this.usedSize = 0;
    }

    @Override
    public boolean empty() {
        return this.usedSize == 0;
    }

    @Override
    public int peek() {
        if(empty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        return this.front.data;
    }

    @Override
    public int poll() {
        if(empty()) {
            throw new UnsupportedOperationException("队列为空");
        }
        int data = this.front.data;
        this.front = this.front.next;
        this.usedSize--;
        return data;
    }

    @Override
    public void add(int item) {
        if(empty()) {
            this.front = new Node(item);
            this.rear = this.front;
        } else {
            this.rear.next = new Node(item);
            this.rear = this.rear.next;
        }
        this.usedSize++;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
