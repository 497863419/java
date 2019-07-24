package Test.DS.LinkedList;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-07-24-09:06
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        ILinked iLinked = new LinkedListImpl();
        /*iLinked.addIndex(0,1);
        iLinked.addIndex(1,2);
        iLinked.addIndex(2,3);
        iLinked.addIndex(3,4);
        iLinked.addIndex(4,5);
        iLinked.addIndex(5,6);
        iLinked.addFirst(0);
        iLinked.addFirst(7);
        System.out.println(iLinked.contains(11));
        System.out.println(iLinked.get(3));//2
        System.out.println(iLinked.set(3,777));
        System.out.println(iLinked.get(3));
        System.out.println(iLinked.remove(3));//777
        System.out.println(iLinked.get(3));*/
        iLinked.addLast(1);
        iLinked.addLast(1);
        iLinked.addLast(4);
        iLinked.addLast(1);
        iLinked.addLast(8);
        iLinked.addLast(1);
        iLinked.addLast(1);
        iLinked.display();
        iLinked.removeAllKey(1);
        iLinked.display();

    }
}
