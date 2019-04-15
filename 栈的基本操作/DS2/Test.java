package DS2;
interface IMyStack {//接口
    // 将 item 压入栈中
    void push(int item);
    // 返回栈顶元素，并且出栈
    int pop();
    // 返回栈顶元素，但不出栈
    int peek();
    // 判断这个栈是否为空栈
    boolean empty();
    // 返回元素个数
    int size();
    //
}
class myStackImpl implements  IMyStack{//子类实现接口
    private int[] elem;
    private int top;//保存的是当前可以存放数据元素的下标
    private int usedSize;
    private static final int  DEFAULT_SIZE=10;  //默认栈的容量
    public myStackImpl(){//构造方法
        this.elem = new int[DEFAULT_SIZE];//新建数组
        this.top=0;
        this.usedSize=0;
    }

    public boolean isFull(){
        return this.top==DEFAULT_SIZE;
    }
    public void push(int item){
        //判满
    if(isFull()){
        throw new ArrayIndexOutOfBoundsException("栈满");
    }
    this.elem[this.top] = item;
    top++;
    usedSize++;





    }

    public int pop(){//返回栈顶元素 并且出栈
        if(empty()) {
            throw new UnsupportedOperationException("栈为空");

        }
        int data = this.elem[this.top-1];
        --this.top;
        return data;

    }
    public int peek(){//返回栈顶元素 但不出栈
        if(empty()) {//判空
            throw new UnsupportedOperationException("栈为空");

        }
        int data = this.elem[this.top-1];  //栈顶下标-1
        return data;

    }
    public boolean empty(){//判空
        if(usedSize==0){//用过数据为 0
            return  true;
        }
        return  false;
    }
    public int size(){
        return this.usedSize;//用过的数据；

    }
}

public class Test {
    public static void main(String[] args) {
        myStackImpl myStack = new myStackImpl();
        myStack.push(10);
        myStack.push(99);
        myStack.push(21);
        myStack.push(77);
        //myStack.push(10);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());


    }
}
