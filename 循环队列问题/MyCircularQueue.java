package com.bit.dao;

//循环队列  基于数组实现
class MyCircularQueue {
    private int front;//队头下表
    private int rear;//队尾下标
    private int[] elem;//数组
    private int usedSize;//有效数据个数
    //private static final int DEFAULT_SIZE = 0;


    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
        //DEFAULT_SIZE = k;
        this.front = 0;
        this.rear = 0;
        this.usedSize = 0;


    }


    public boolean enQueue(int value) {//入队
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear + 1) % this.elem.length;
        this.usedSize++;
        return true;
    }


    public boolean deQueue() {//出队
        if (isEmpty()) {
            return false;
        }
            this.front = (this.front + 1) % this.elem.length;
            this.usedSize--;
            return true;

    }


    public int Front() {//得到队头元素
        if(isEmpty()){
            return -1;
        }return  this.elem[this.front];
    }


    public int Rear() {//得到队尾元素
         if(isEmpty()){
             System.out.println("队为空");
             return -1;
         }/*else if(isFull()){
             return (this.elem[this.rear-1]);
         }
         return (this.elem[this.usedSize-1]);
         */


        if(rear==0){
           return (this.elem.length-1);
        }
        return elem[rear-1];
    }


    public boolean isEmpty() {//判空
        return this.usedSize == 0;

    }


    public boolean isFull() {//判满
        //为了判满，浪费一个数据单元表示队满
        if ((this.rear + 1) % this.elem.length == this.front) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */