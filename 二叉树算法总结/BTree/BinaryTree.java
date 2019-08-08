package com.DS.BTree;


import java.util.*;

/**
 * @Name：二叉树实现类
 * @Author：ZYJ
 * @Date：2019-07-30-17:58
 * @Description:
 */


public class BinaryTree implements IBinaryTree {
    private BinaryNode root;

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }



    /**
     * 判断树为空
     *
     * @return true or false
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * 二叉树的结点数量
     * @return
     */
    @Override
    public int size() {
        System.out.print("二叉树的结点数量：");
        return this.size(root);
    }
    private int size(BinaryNode root){
        if(root!=null){
            int lSize=this.size(root.left);
            int rSize=this.size(root.right);
            return lSize+rSize+1;
        }else {
            return 0;
        }
    }

    /**
     * 二叉树的高度
     * @return
     */
    @Override
    public int getHeight() {
        System.out.print("二叉树的高度为: ");

        return this.getHeight(root);
    }

    private int getHeight(BinaryNode root) {
        if (root != null) {
            //获取左子树的高度
            int nl=this.getHeight(root.left);
            //获取右子树的高度
            int nr=this.getHeight(root.right);
            return (nl>nr ? nl+1:nr+1);

        } else {
            return 0;
        }

    }

    /**
     * 查找二叉树中的某个值
     * @param value
     * @return
     */
    @Override
    public BinaryNode findKey(Object value) {
        return this.findKey(value,root);
    }
    private BinaryNode findKey(Object value,BinaryNode root){
        if(root==null) {
            return null;
        }else if(root !=null && root.value==value){
         return root;
        }else {
            BinaryNode node1 = this.findKey(value,root.left);
            BinaryNode node2 = this.findKey(value,root.right);
            if(node1!=null && node1.value==value){
                return node1;
            }else if(node2!=null && node2.value==value){
                return node2;
            }else {
                return null;
            }
        }
    }


    /**
     * 树的先序遍历
     */
    @Override
    public void preOrderTraverse() {
        System.out.print("先序遍历：");
        this.preOrderTraverse(root);
        System.out.println();
    }
    private void preOrderTraverse(BinaryNode root) {
        if (root != null) {
            //输出根节点的值
            System.out.print(root.value + " ");
            //构建左子树
            this.preOrderTraverse(root.left);
            //构建右子树
            this.preOrderTraverse(root.right);
        }
    }

    /**
     * 树的中序遍历
     */
    @Override
    public void inOrderTraverse() {
        System.out.print("中序遍历：");
        this.inOrderTraverse(this.root);
        System.out.println();

    }

    private void inOrderTraverse(BinaryNode root) {
        if (root != null) {
            //遍历左子树
            this.inOrderTraverse(root.left);
            //输出根的值
            System.out.print(root.value + " ");
            //遍历右子树
            this.inOrderTraverse(root.right);
        }

    }

    /**
     * 二叉树的后序遍历
     */
    @Override
    public void postOrderTraverse() {
        System.out.print("后序遍历：");
        postOrderTraverse(this.root);
        System.out.println();
    }

    @Override
    public void postOrderTraverse(BinaryNode root) {
        if (root != null) {
            this.postOrderTraverse(root.left);
            this.postOrderTraverse(root.right);
            System.out.print(root.value + " ");
        }
    }


    /**
     * 二叉树的中序遍历(非递归)   借助栈
     */
    @Override
    public void inOrderByStack() {
        System.out.print("中序非递归遍历：");
        //创建栈
        Deque<BinaryNode> stack = new LinkedList<BinaryNode>();
        BinaryNode current =root;
        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current=current.left;
            }
            if(!stack.isEmpty()){
                current=stack.pop();
                System.out.print(current.value+" ");
                current=current.right;
            }
        }
        System.out.println();


    }

    /**
     * 前序非递归遍历
     */
    @Override
    public void preOrderByStack() {
        System.out.print("前序非递归遍历：");
        if (root==null){
            System.out.println("二叉树为空！！！");
        }else {
            LinkedList<BinaryNode> list = new LinkedList<BinaryNode>();
            Queue<BinaryNode> stack = new LinkedList<>();
            BinaryNode current = root;
            while (current!=null || !stack.isEmpty()){
                while (current!=null){
                    list.add(current);
                    ((LinkedList<BinaryNode>) stack).push(current);
                    current = current.left;
                }
                if(!stack.isEmpty()){
                    current =((LinkedList<BinaryNode>) stack).pop();
                    current =current.right;
                }
            }

            for(BinaryNode binaryNode : list){
                System.out.print(binaryNode.value+" ");
            }
            System.out.println();
        }


    }

    /**
     * 后序非递归遍历
     */
    @Override
    public void postOrderByStack() {
        System.out.print("后序非递归遍历：");
        ArrayList<BinaryNode> list = new ArrayList<BinaryNode>();
        if(root!=null){
            Deque<BinaryNode> stack = new LinkedList<>();
            stack.push(root);
            while (!stack.isEmpty()){
                BinaryNode current = stack.pop();
                list.add(0,current);
                if(current.left!=null){
                    stack.push(current.left);
                }
                if(current.right!=null){
                    stack.push(current.right);
                }
            }
            Iterator<BinaryNode> iterator  = list.iterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next().value+" ");
            }
            System.out.println();
        }

    }

    /**
     * 按照层次遍历二叉树  借助队列
     */
    @Override
    public void levelOrderByStack() {
        System.out.print("按照层次遍历二叉树：");
        if(root!=null){
            //创建队列
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            queue.add(root);
            while (queue.size()!=0){
                int len =queue.size();
                for(int i=0;i<len;i++){
                    //出队并保存
                    BinaryNode temp = queue.poll();
                    System.out.print(temp.value+" ");
                    if(temp.left!=null){
                        queue.add(temp.left);
                    }
                    if(temp.right!=null){
                        queue.add(temp.right);
                    }
                }
            }
            System.out.println();
        }else {
            System.out.println("二叉树为空！");
        }
    }
}
