package Test.DS.BTree;

import com.DS.BTree.BinaryTree;
import org.w3c.dom.Node;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Name：二叉树的实现类
 * @Author：ZYJ
 * @Date：2019-08-02-09:38
 * @Description:
 */
public class BinaryTreeImpl implements IBinaryTree{
    private BinaryNode root;

    public BinaryTreeImpl(BinaryNode root) {
        this.root = root;
    }

    /**
     * 二叉树判空
     * @return
     */
    @Override
    public boolean isEmpty() {
        return root==null;
    }

    /**
     * 获取二叉树的结点个数
     * @return
     */
    @Override
    public int size() {
        System.out.print("二叉树的结点个数为：");

        return this.size(root);
    }
    private int size(BinaryNode root){
        if(root!=null){
            int lSize = this.size(root.left);
            int rSize = this.size(root.right);
            return lSize+rSize+1;
        }else {
            return 0;
        }
    }

    /**
     *二叉树的高度
     * @return
     */
    @Override
    public int getHeight() {
        System.out.print("二叉树的高度为: ");
        return getHeight(root);
    }
    private int getHeight(BinaryNode root){
        if(root!=null){
            int LHeight = this.getHeight(root.left);
            int RHeight = this.getHeight(root.right);
            return (LHeight>RHeight ? LHeight+1:RHeight+1);
        }else {
            return 0;
        }
    }

    /**
     * 在二叉树中查找某一指定值
     * @param value
     * @return
     */
    @Override
    public BinaryNode findKey(Object value) {
        return findKey(value,root);
    }
    private BinaryNode findKey(Object value,BinaryNode root){
        if (root==null){
            return null;
        }else if(root!=null && root.value==value){
            return root;
        }else {
            BinaryNode node1 = this.findKey(value,root.left);
            BinaryNode node2 = this.findKey(value,root.right);
            if(node1!=null&& node1.value==value){
                return node1;
            }else if(node2!=null && node2.value==value){
                return node2;
            }else {
                return null;
            }
        }
    }

    /**
     * 二叉树的前序遍历
     */
    @Override
    public void preOrderTraverse() {
        System.out.print("二叉树的前序遍历：");
        this.preOrderTraverse(root);
        System.out.println();
    }
    private void preOrderTraverse(BinaryNode root){
        if(root!=null){
            System.out.print(root.value+" ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
    }

    /**
     * 二叉树的中序遍历
     */
    @Override
    public void inOrderTraverse() {
        System.out.print("二叉树的中序遍历：");
         this.inOrderTraverse(root);
        System.out.println();
    }
    private void inOrderTraverse(BinaryNode root){
        if(root!=null){
            inOrderTraverse(root.left);
            System.out.print(root.value+" ");
            inOrderTraverse(root.right);
        }
    }

    /**
     * 二叉树的后序遍历
     */

    @Override
    public void postOrderTraverse() {
        System.out.print("二叉树的后续遍历：");
        this.postOrderTraverse(root);
        System.out.println();
    }
    private void postOrderTraverse(BinaryNode root){
        if(root!=null){
            this.postOrderTraverse(root.left);
            this.postOrderTraverse(root.right);
            System.out.print(root.value+" ");
        }
    }


    /**
     * 非递归式前序遍历 借助栈
     */
    @Override
    public void inOrderByStack() {
        System.out.print ("中序非递归遍历：");
        Deque<BinaryNode> stack = new LinkedList<BinaryNode>();
        BinaryNode current = root;
        while (current!=null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current = current.left;
            }
            if(!stack.isEmpty()){
                current=stack.pop();
                System.out.print(current.value+" ");
                current =current.right;

            }
        }

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    /**
     * 按照层次进行遍历  借助队列
     */
    @Override
    public void levelOrderByStack() {
        if(root!=null){
            System.out.print("二叉树按层次遍历：");
            //新建队列
            Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
            ((LinkedList<BinaryNode>) queue).add(root);
            while (queue.size()!=0){
                int len =queue.size();
                for(int i=0;i<len;i++){
                    BinaryNode temp = queue.poll();
                    System.out.print(temp.value+" ");
                    if (temp.left!=null){
                        ((LinkedList<BinaryNode>) queue).add(temp.left);
                    }
                    if(temp.right!=null){
                        ((LinkedList<BinaryNode>) queue).add(temp.right);
                    }

                }
            }
            System.out.println();
        }else {
            System.out.println("二叉树为空");
        }
    }
}
