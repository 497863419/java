package com.bit.dao;

class Solution {
    public boolean isValid(String str) {
        char[] stack = new char[str.length()];
        int top = 0;
        //char ch = str.charAt(0);
        // )
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' ||
                    str.charAt(i) == '{' ||
                    str.charAt(i) == '[') {
                stack[top++] = str.charAt(i);
            }else{
                //可能是右括号 --》
                //2、top == 0
                if(top == 0) {
                    System.out.println("右括号多");
                    return false;
                }
                //取出栈顶元素
                char ch = stack[top-1];
                if(ch == '[' && str.charAt(i)==']'||
                        ch == '(' && str.charAt(i)==')'
                        || ch == '{' && str.charAt(i)=='}') {
                    //匹配了一对括号了；
                    --top;
                }else {
                    System.out.println("右括号匹配的顺序不一致");
                    return false;
                }
            }
        }
        //栈内有数据--->左括号
        if(top > 0) {
            System.out.println("左括号多于右括号");
            return false;
        }
        System.out.println("左右括号匹配");
        return true;
    }
}

public class TestMain {
    public static void main5(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(9);
        minStack.push(11);
        minStack.push(5);
        minStack.push(-8);
        minStack.push(-8);
        System.out.println(minStack.getMin());//-8
        minStack.pop();
        System.out.println(minStack.getMin());//-8

    }
    //两个栈实现一个队列的测试用例
    public static void main6(String[] args) {
        TestMyQueue testMyQueue = new TestMyQueue();
        testMyQueue.push(11);
        testMyQueue.push(12);
        testMyQueue.push(13);
        testMyQueue.push(14);
        System.out.println(testMyQueue.peek());//11
        testMyQueue.push(15);
        testMyQueue.pop();
        System.out.println(testMyQueue.peek());//12
        testMyQueue.pop();
        testMyQueue.pop();
        testMyQueue.pop();
        System.out.println(testMyQueue.peek());
    }
    //两个队列实现栈的测试用例
    public static void main3(String[] args) {
        TestMyStack testMyStack = new TestMyStack();
        testMyStack.push(10);
        testMyStack.push(20);
        testMyStack.push(30);
        System.out.println(testMyStack.pop());//30
        System.out.println(testMyStack.top());//20
        System.out.println(testMyStack.size());
    }
    //括号匹配的测试用例
    public static void main2(String[] args) {
        Solution solution = new Solution();
        boolean flg1 = solution.isValid("{[]}");//true
        System.out.println(flg1);
        boolean flg2 = solution.isValid("([)]");//false
        System.out.println(flg2);
        boolean flg3 = solution.isValid("{([])");//false
        System.out.println(flg3);
    }

    public static void main4(String[] args) {
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
        /*MyStackImpl myStack = new MyStackImpl();
        myStack.push(10);
        myStack.push(99);
        myStack.push(21);
        myStack.push(77);
        System.out.println(myStack.pop());//77
        System.out.println(myStack.peek());//21
        System.out.println(myStack.size());//3*/
    }

    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(10);
        myCircularQueue.enQueue(10);
        myCircularQueue.enQueue(20);
        myCircularQueue.enQueue(30);
        myCircularQueue.enQueue(40);
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.isFull());
        System.out.println(myCircularQueue.isEmpty());



    }
}
