 package Test.DS.BTree;

/**
 * @Name：测试类
 * @Author：ZYJ
 * @Date：2019-08-02-09:38
 * @Description:
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryNode node7=new BinaryNode(7,null,null);
        BinaryNode node6 = new BinaryNode(3,null,null);
        BinaryNode node5 = new BinaryNode(4,node6,node7);
        BinaryNode node4 = new BinaryNode(1,null,null);
        BinaryNode node3 = new BinaryNode(2,node4,node5);
        BinaryNode node2 = new BinaryNode(8,null,null);
        BinaryNode node1 =new BinaryNode(6,node3,node2);

        BinaryTreeImpl binaryTree = new BinaryTreeImpl(node1);

        System.out.println(binaryTree.size());//获取二叉树的结点数
        System.out.println(binaryTree.isEmpty());//二叉树判空
        System.out.println(binaryTree.getHeight());//获取二叉树高度
        System.out.println(binaryTree.findKey(9));//找指定值
        System.out.println(binaryTree.findKey(4));

        binaryTree.preOrderTraverse();//前序遍历 6 2 1 4 3 7 8
        binaryTree.inOrderTraverse();//中序遍历  1 2 3 4 7 6 8
        binaryTree.postOrderTraverse();//后续遍历  1 3 7 4 2 8 6
        binaryTree.levelOrderByStack();//按照层次遍历 6 2 8 1 4 3 7
        binaryTree.inOrderByStack();//中序遍历非递归  1 2 3 4 7 6 8
    }
}
