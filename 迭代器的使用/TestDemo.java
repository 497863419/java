package IteratorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Name： Iterstor 迭代器的使用
 * @Author：ZYJ
 * @Date：2019-05-30-21:32
 * @Description:
 */
public class TestDemo {
    public static void main(String[] args) {
        //获取迭代器实现类对象
        Collection<String> coll = new ArrayList<>();
        coll.add("hello");
        coll.add("java");
        coll.add("world");
        //获取迭代器的实现类对象，并把索引指向集合的-1索引
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            //取出下一个元素，并把指针移至下一位。
            String str = it.next();
            System.out.println(str);
        }
    }
}
