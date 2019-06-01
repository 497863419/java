package IteratorTest;

import java.util.ArrayList;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-05-30-21:52
 * @Description:
 */
public class foreachDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String s :list){
            System.out.println(s);
        }
    }
}
