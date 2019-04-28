package com.bit.dao;

import com.bit.Impl.ILinked;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-04-25-18:55
 * @Description:
 */
public class MySingleListImpl implements ILinked {
    private Node head;//引用数据类型
    private int size;


    /**
     * 内部类
     */
    public class Node {
        private Object data;
        private Node next;

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * 构造函数 初始化属性
     */
    public MySingleListImpl() {
        this.head = null;
    }

    /**
     * 头插法
     *
     * @param data
     */
    @Override
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = head;
            this.head = newNode;
        }
        size++;
    }

    /**
     * 尾插法
     *
     * @param data
     */
    @Override
    public void addLast(int data) {
        Node newNode = new Node(data);
        Node cur = this.head;
        //第一次插入
        if (cur == null) {
            this.head = newNode;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > getLength()) {
            throw new IndexOutOfBoundsException("下标不合法");
        }
    }

    /**
     * 找到index-1位置的节点
     *
     * @param index
     * @return
     */
    private Node searchIndex(int index) {
        checkIndex(index);
        int count = 0; //记录走的步数
        if (index == 0) {
            return null;
        }
        Node cur = this.head;
        while (cur.next != null && count < index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    @Override
    public boolean addIndex(int index, int data) {
        Node newNode = new Node(data);
        Node cur = searchIndex(index);
        if (cur == null) {
            //addFirst(data);
            newNode.next = this.head;
            this.head = newNode;
        } else {
            newNode.next = cur.next;
            cur.next = newNode;
        }
        size++;
        return false;
    }

    /**
     * 在单链表中查找特定数值
     *
     * @param key
     * @return
     */
    @Override
    public boolean contains(int key) {
     /*   Node cur = this.head;
        while (cur != null) {
            if (cur.data.equals(key)) {
                  return true;
            }
            cur=cur.next;
        }
        return false;*/


     Node cur = this.head;
     for(int i=0;cur!=null;i++){
         if(cur.data.equals(key)){
             return true;
         }
         cur=cur.next;
     }
     return false;
    }

    /**
     * 删除第一次出现关键字为key的节点
     *
     * @param key
     * @return
     */
    @Override
    public int remove(int key) {
        return 0;
    }

    /**
     * 删除所有值为key的节点
     *
     * @param key
     */
    @Override
    public void removeAllKey(int key) {


    }

    /**
     * 得到链表的长度  节点的个数
     *
     * @return
     */
    @Override
    public int getLength() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 打印单链表中的数据
     */
    @Override
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     *
     */
    @Override
    public void clear() {

    }
}
