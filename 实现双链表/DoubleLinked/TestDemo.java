package com.DS.DoubleLinked;

/**
 * @Name：测试类
 * @Author：ZYJ
 * @Date：2019-07-24-10:27
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        ILinked iLinked = new DoubleLikedImpl();
        iLinked.addFirst(1);
        iLinked.addFirst(2);
        iLinked.addFirst(3);
        iLinked.addIndex(1, 3);
        iLinked.display();//3321
        iLinked.addLast(3);
        iLinked.display();//33213
        System.out.println(iLinked.contains(3));//true
        System.out.println(iLinked.getLength());//5
        System.out.println(iLinked.contains(7));//false
        System.out.println(iLinked.contains(3));//true
        System.out.println(iLinked.contains(0));//false
        iLinked.display();//33213
        System.out.println(iLinked.remove(1));//3
        iLinked.display();//3213
        System.out.println(iLinked.set(2,8));//3
        //System.out.println(iLinked.get(0));//8
        iLinked.display();//3283
        System.out.println(iLinked.set(0,7));
        iLinked.display();
        iLinked.addFirst(2);
        iLinked.addLast(2);
        iLinked.display();//272832
        iLinked.removeAllKey(2);
        iLinked.display();//783






    }


}
