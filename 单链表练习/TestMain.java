package com.bit.dao;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-04-25-19:05
 * @Description:
 */
public class TestMain {
    public static void main(String[] args) {
        MySingleListImpl mySingleList = new MySingleListImpl();
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.addFirst(3);
        mySingleList.addFirst(3);
        mySingleList.display();
        mySingleList.addIndex(3,16);
        mySingleList.display();
        System.out.println(mySingleList.getLength());
        System.out.println(mySingleList.contains(2));
        System.out.println(mySingleList.contains(6));
        System.out.println(mySingleList.contains(3));


        System.out.println();


    }
}
