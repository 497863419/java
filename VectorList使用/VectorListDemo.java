package VectorListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @Name：  Vector集合的使用
 * @Author：ZYJ
 * @Date：2019-06-20-19:42
 * @Description:
 */
public class VectorListDemo {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("java");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
