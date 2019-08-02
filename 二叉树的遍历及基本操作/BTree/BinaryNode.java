package Test.DS.BTree;

/**
 * @Name：二叉树的结点类
 * @Author：ZYJ
 * @Date：2019-08-02-09:39
 * @Description:
 */
public class BinaryNode {

    Object value;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(Object value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(Object value) {
        this(value,null,null);
    }

    /**
     * 覆写toString()
     * @return
     */
    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                ", left=" + left.value +
                ", right=" + right.value +
                '}';
    }
}
