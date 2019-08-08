package com.DS.BTree;

/**
 * @Name：  二叉树的接口
 * @Author：ZYJ
 * @Date：2019-08-01-10:14
 * @Description:
 */
public interface IBinaryTree {
    boolean isEmpty();
    int size();
    int getHeight();
    BinaryNode findKey(Object value);
    void preOrderTraverse();
    void inOrderTraverse();
    void postOrderTraverse();

    void postOrderTraverse(BinaryNode node);
    //前序遍历非递归操作
    void inOrderByStack();
    //中序遍历非递归操作 （借助栈）
    void preOrderByStack();
    //后序遍历非递归操作
    void postOrderByStack();
    //按照层次遍历（借助队列）
    void levelOrderByStack();
}

