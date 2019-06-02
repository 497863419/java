package Test.zyj;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Name：集合类与通配符
 * @Author：ZYJ
 * @Date：2019-06-01-16:14
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<String> list1= new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        printArray(list);
       printArray(list1);
    }
    //遍历集合，但集合中数据类型不唯一，这是不确定写哪一种数据类型  所有写？ 写其他的数据类型会报错
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }

}
