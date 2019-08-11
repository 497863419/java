package com.DS.BinarySearchTree;

import java.nio.BufferUnderflowException;

/**
 * @Name：   二叉查找树的实现
 * @Author：ZYJ
 * @Date：2019-08-11-13:05
 * @Description:
 */
public class BinarySearchTree<T extends  Comparable<? super T>>{
    private static  class BinaryNode<T>{
        T element;
        BinaryNode<T> left;
        BinaryNode<T> right;

        public BinaryNode(T element) {
            this(element,null,null);
        }

        public BinaryNode(T element, BinaryNode<T> left, BinaryNode<T> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
    }

    private  BinaryNode<T> root;


    public BinarySearchTree(BinaryNode<T> root) {
        this.root = null;
    }
    public void makeEmpty(){
        root=null;
    }
    public boolean isEmpty(){
        return root==null;
    }

    /**
     * 判断二插查找树是否含有 指定结点
     * @param x
     * @return
     */
    public boolean contains(T x){
        return contains(x,root);
    }

    private boolean contains(T x , BinaryNode<T> t){
        if(t==null) {
            return false;
        }
        int compareResult = x.compareTo(t.element);

        if(compareResult<0){
            return contains(x,t.left);
        }else if(compareResult>0){
            return contains(x,t.right);
        }else  return  true;

    }

    /**
     * 查找最小结点
     * @return
     */
    public T findMin(){
        if (isEmpty()) throw  new BufferUnderflowException();
        return findMin(root).element;
    }

    private BinaryNode<T> findMin(BinaryNode<T> t){
        if (t==null){
            return null;
        }
        if(t.left == null){
           return  t;
        }else
            return  findMin(t.left);

    }

    /**
     * 查找最大结点
     * @return
     */
    public T findMax(){
        if(isEmpty()) throw  new BufferUnderflowException();
        return findMax(root).element;
    }

    private BinaryNode<T> findMax(BinaryNode<T> t){
        if (t==null){return null;}
        while (t.right!=null){
            t=t.right;
        }
        return t;
    }

    /**
     * 二叉查找树插入操作
     * @param x
     */
    public void insert(T x){
        root = insert(x,root);
    }
    private BinaryNode<T> insert(T x ,BinaryNode<T> t){
        if (t==null){
            return  new BinaryNode<T>(x,null,null);
        }

        int compareResult = x.compareTo(t.element);
        if(compareResult<0){
            return insert(x,t.left);
        }else if(compareResult>0){
            return insert(x,t.right);
        }else ;
        return t;
    }

    /**
     * 二叉查找树的删除
     * @param x
     */
    public void remove(T x){
        root=remove(x,root);
    }

    private BinaryNode<T> remove(T x, BinaryNode<T> t){
        if (t==null){
            return null;
        }
        int compareResult = x.compareTo(t.element);

        if(compareResult<0){
            t.left = remove(x,t.left);
        }else if(compareResult>0){
            t.right = remove(x,t.right);
        }else if(t.left!=null && t.right!=null){
            t.element = findMin(t.right).element;
            t.right = remove(x,t.right);
        }else {
            t = (t.left!=null) ? t.left : t.right;
        }
        return t;
    }

    /**
     * 打印二叉树 使用中序遍历递归法 
     */
    public  void printTree(){
        if(isEmpty()){
            System.out.println("二叉查找树为空！！！");
        }else
            printTree(root);
    }
    private void printTree(BinaryNode<T> t){
        if (t!=null){
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }
}
