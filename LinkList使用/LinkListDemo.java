package LinkListTest;

import java.util.LinkedList;
import java.util.List;

/**
 * @Name： LinkList集合的使用
 * @Author：ZYJ
 * @Date：2019-06-20-20:15
 * @Description:
 */
public class LinkListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("hello");
        list.add("world");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
