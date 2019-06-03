package Demo.zyj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-06-01-16:38
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();
        list1.add(1);
        list2.add("abs");
        list3.add(34);
        list4.add("sdas");
        list4.add(1212);

        /**
         * 泛型为Number 可以同时使用
         */
        getElement(list3);
        getElement2(list3);


        //getElement(list2);//报错 String类既不是Number类的子类也不是Number的父类
        //getElement2(list2); //报错

        getElement(list1);
        //getElement2(list1); //报错 Integer类不是Number类的父类

       // getElement(list4);//报错  Object类是Number类的父类
        getElement2(list4);
    }

    /**
     * 设置上限 ？必须是 Number的子类或本类
     * @param coll
     */
    public static void getElement(Collection<? extends Number> coll){
        Iterator<?> iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 设置下限 ？ 必须是Number 的父类或本类
     * @param coll
     */
    public static void getElement2(Collection<? super Number> coll){
        Iterator<?> iterator2 = coll.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }

}
