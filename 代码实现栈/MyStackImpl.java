
public class MyStackImpl implements IMyStack{
    private int[] elem;
    private int top;//保存的是当前可以存放数据元素的下标
    private int usedSize;
    //默认的栈的容量
    private static final int DEFAULT_SIZE = 10;

    public MyStackImpl() {
        this.elem = new int[DEFAULT_SIZE];
        this.top = 0;
        this.usedSize = 0;
    }

    public boolean isFull(){
        /*if(this.top == this.elem.length) {
            return true;
        }
        return false;*/
        return this.top == this.elem.length;
    }

    @Override
    public void push(int item) {
        if(isFull()) {
            throw new UnsupportedOperationException("栈为" +
                    "满的");
        }
        this.elem[this.top++] = item;
        this.usedSize++;
    }

    @Override
    public int pop() {
        if(empty()) {
            throw new UnsupportedOperationException("栈为空");
        }
        int data = this.elem[this.top-1];
        --this.top;
        this.usedSize--;
        return data;
    }

    @Override
    public int peek() {
        if(empty()) {
            throw new UnsupportedOperationException("栈为空");
        }

        return this.elem[this.top-1];
    }

    @Override
    public boolean empty() {
        return this.top == 0;
    }

    @Override
    public int size() {
        return this.usedSize;
    }
}
