package com.DS.DoubleLinked;

import java.util.Vector;

/**
 * @Name： 双链表实现
 * @Author：ZYJ
 * @Date：2019-07-24-10:25
 * @Description:
 */
public class DoubleLikedImpl implements ILinked {
    private Node head;//头节点
    private Node last;//尾结点
    private int size;//长度

    /**
     * 创建节点类
     */
    private class Node {
        private Node prev;//前驱
        private Object data;//值
        private Node next;//后继

        public Node(Node prev, Object data, Node next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public Node(Object data) {
            this.data = data;
        }
    }

    /**
     * 头插
     *
     * @param data
     */
    @Override
    public void addFirst(Object data) {
        Node prev = head;
        Node newNode = new Node(null, data, prev);
        head = newNode;
        if (prev == null) {
            last = newNode;
        } else {
            prev.prev = newNode;
        }
        size++;
    }

    /**
     * 尾插
     *
     * @param data
     */
    @Override
    public void addLast(Object data) {
        Node pred = this.last;//尾结点
        Node newNode = new Node(pred, data, null);
        this.last = newNode;//将新节点设置为尾结点
        if (pred == null) {//若尾结点为null
            this.head = newNode;//链表为空，新节点为头节点
        } else {
            pred.next = newNode;
        }
        this.size++;
    }

    private boolean isLinkIndex(int index) {
        if (index < 0 || index > size) {
            return false;
        }
        return true;
    }

    @Override
    public void addIndex(int index, Object data) {
        if(isLinkIndex(index)){
            Node temp =node(index);
            Node prev =temp.prev;
            Node newData =new Node(prev,data,temp);
            temp.prev=newData;
            if(prev==null){
                this.head=newData;
            }else {
                prev.next=newData;
            }
            size++;
        }


    }

    @Override
    public boolean contains(Object data) {
        if (data == null) {
            for (int i = 0; i <this.size; i++) {
                if (node(i).data == null) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i <this.size; i++) {
                if (node(i).data.equals(data)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        if (isLinkIndex(index)) {
            Node temp = node(index);
            Object oldData = temp.data;
            unLink(temp);
            return oldData;
        }
        return null;
    }

    private Object unLink(Node x) {
        Object elementData = x.data;
        Node prev = x.prev;
        Node next = x.next;
        if(prev==null){
            this.head=next;
        }else {
            prev.next=next;
            x.prev=null;
        }
        if(next==null){
            this.last=prev;
        }else{
            next.prev=prev;
            x.next=null;
        }
        x.data=null;
        this.size--;
        return elementData;
    }

    /**
     * 删除所值为Key的节点；
     * @param key
     */
    @Override
    public void removeAllKey(Object key) {
        Node pred =this.head;
      while (pred!=null){
          Node prev =pred.prev;
          Node next =pred.next;
          if(pred.data==key){
              if(prev==null){
                  this.head=next;
              }else{
                  prev.next=next;
                  pred.prev=null;
              }
              if(next==null){
                  this.last=prev;
              }else {
                  next.prev=prev;
                  pred.next=null;
              }
              pred.data=null;
              size--;
              pred=next;
          }else {
              pred=pred.next;
          }

      }
    }

    @Override
    public Object get(int index) {
        if(!isLinkIndex(index)){
            return null;
        }
        return node(index).data;
    }

    @Override
    public Object set(int index, Object newData) {
        if(!isLinkIndex(index)){
            return null;
        }
        Node node = node(index);
        Object oldData = node.data;
        node.data=newData;
        return oldData;
    }

    @Override
    public int getLength() {
        return size;
    }

    @Override
    public void display() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(node(i).data);
        }
        System.out.println();

    }

    /**
     * 获取当前节点
     *
     * @param index
     * @return
     */
    private Node node(int index) {
        isLinkIndex(index);
        if (index < (size >> 1)) {
            Node temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        Node temp = this.last;
        for (int i = size - 1; i > index; i--) {
            temp = temp.prev;
        }
        return temp;
    }
}
