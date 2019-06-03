package Test.zyj.com;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Name： 集合中不使用泛型和使用泛型
 * @Author：ZYJ
 * @Date：2019-06-01-14:47
 * @Description:
 */
public class Demo01Test {
    public static void main(String[] args) {
        showo1();
         show2();
    }

    /**
     * 集合类使用泛型
     */
    private static void showo1(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(11);
        //使用迭代器遍历
        Iterator it  = list.iterator();
        while (it.hasNext()){
            Object object = it.next();
            //向下转型 强制转换
            String s = (String) object;
            System.out.println(s.length());
        }
    }

    /**
     * 集合类使用泛型
     */
    private static void show2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("ddd");
        Iterator it2 = list.iterator();
        while (it2.hasNext()){
            Object o =it2.next();
            String ss = (String) o;
            System.out.println(ss.length());
        }
        System.out.println();
    }
}
