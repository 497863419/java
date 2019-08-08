package com.DS.BTree;

/**
 * @Name：测试类
 * @Author：ZYJ
 * @Date：2019-08-01-10:41
 * @Description:
 */
public class TreeTest {
    public static void main(String[] args) {
        BinaryNode Node7 = new BinaryNode(7,null,null);
        BinaryNode Node6 = new BinaryNode(6,null,Node7);
        BinaryNode Node5 = new BinaryNode(3,null,null);
        BinaryNode Node4 = new BinaryNode(5,null,null);
        BinaryNode Node3 = new BinaryNode(2,Node5,Node6);
        BinaryNode Node2 = new BinaryNode(4,null,Node4);
        BinaryNode Node1 = new BinaryNode(1,Node2,Node3);
                //根节点为 Node1的
        BinaryTree binaryTree = new BinaryTree(Node1);

        /*BinaryTree binaryTree1 = new BinaryTree();
        System.out.println(binaryTree1.getHeight());
        System.out.println(  binaryTree1.size());*/



        //二叉树判空
        System.out.println(binaryTree.isEmpty());

        //先序遍历  1 4 5 2 3 6 7
        binaryTree.preOrderTraverse();//1452367
        //中序遍历  4 5 1 3 2 6 7
        binaryTree.inOrderTraverse();//4513267

        //后序遍历  5 4 3 7 6 2 1
        binaryTree.postOrderTraverse();

        //二叉树的高度
        System.out.println(binaryTree.getHeight());

        //二叉树的结点个数
        System.out.println(binaryTree.size());

        //查找二叉树中的某个值
        System.out.println(binaryTree.findKey(1));
        System.out.println(binaryTree.findKey(9));

        //按照层次遍历二叉树
        binaryTree.levelOrderByStack();//1 4 2 5 3 6 7

        //中序遍历非递归
        binaryTree.inOrderByStack();//4 5 1 3 2 6 7

        //后续非递归遍历
        binaryTree.postOrderByStack();//5 4 3 7 6 2 1

        //前序非递归遍历
        binaryTree.preOrderByStack();

    }

}
