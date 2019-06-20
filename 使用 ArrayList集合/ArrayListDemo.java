package ArrayListTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Name：  使用ArrayList集合
 * @Author：ZYJ
 * @Date：2019-06-18-20:41
 * @Description:
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("java");
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
