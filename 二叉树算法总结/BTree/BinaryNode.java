package com.DS.BTree;

/**
 * 二叉树的结点类
 */
class BinaryNode {

    Object value;
    BinaryNode left;
    BinaryNode right;

    public BinaryNode(Object value) {
        this(value, null, null);
    }

    public BinaryNode(Object value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                ", left=" + left.value +
                ", right=" + right.value +
                '}';
    }
}
