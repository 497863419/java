package com.bit.dao;//用栈实现队列

public class TestMyQueue {
    private MyStackImpl myStack1;
    private MyStackImpl myStack2;

    public TestMyQueue() {
        myStack1 = new MyStackImpl();
        myStack2 = new MyStackImpl();
    }
    //入队放到第一个栈里面
    public void push(int x) {
        myStack1.push(x);
    }
    //出队：===》
    public int pop() {
        if(myStack2.empty()){
            //把s1里面的数据全部放入s2.
            while(!myStack1.empty()) {
                myStack2.push(myStack1.pop());
            }
        }
        int tmp = -1;
        if(!myStack2.empty()){
            //直接弹出s2栈顶元素
            tmp = myStack2.pop();
        }
        return tmp;
    }
    //得到队头的元素
    public int peek() {
        int data = 0;
        if(myStack2.empty()) {
            while (!myStack1.empty()){
                myStack2.push(myStack1.pop());
            }
        }
        data = myStack2.peek();
        return data;
        /*if(myStack2.empty()){
            //把s1里面的数据全部放入s2.
            while(!myStack1.empty()) {
                myStack2.push(myStack1.pop());
            }
        }
        int tmp = -1;
        if(!myStack2.empty()){
            //直接弹出s2栈顶元素
            tmp = myStack2.peek();
        }
        return tmp;*/
    }

    public boolean empty() {
        if(myStack1.empty() && myStack2.empty()){
            return true;
        }
        return false;
    }
}
