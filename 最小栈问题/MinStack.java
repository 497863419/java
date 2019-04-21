

package com.bit.dao;
public class MinStack {
    private MyStackImpl myStack1;
    private MyStackImpl minStack;
    public MinStack() {
        myStack1 = new MyStackImpl();
        minStack = new MyStackImpl();
    }

    public void push(int x) {
        myStack1.push(x);
        if(minStack.empty()) {
            minStack.push(x);
        }else {
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        if(!myStack1.empty()){
            int tmp = myStack1.pop();
            //判断出栈的元素是否和
            //最小栈的栈顶元素相同
            //相同也必须出栈，维护最小值
            if(tmp == minStack.peek()){
                minStack.pop();
            }
        }
    }

    //返回栈顶元素 不是最小栈
    public int top() {
        if(myStack1.empty()) {
            return -1;
        }
        return myStack1.peek();
    }

    public int getMin() {
        if(minStack.empty()){
            return -1;
        }
        return minStack.peek();
    }
}
