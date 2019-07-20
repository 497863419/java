package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Name：遍历Map集合
 * @Author：ZYJ
 * @Date：2019-07-19-15:59
 * @Description: 第一种方法 ：寻找键与值的方式
 *               第二种方法：使用Entry对象遍历
 */
public class MapTestDemo {
    public static void main1(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aamda");
        map.put(2, "Dabe");
        map.put(3, "xianxian");

        //1，使用keySet()把Map集合中的所有key取出来存储到Set集合中。
        Set<Integer> set = map.keySet();
        //2，使用迭代器/增强for循环遍历Set集合，获取Map集合的每一个Key。
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            // 3，通过get（key）可以获取value
            String value = map.get(key);
            System.out.println( value + ":" + key);
        }
         //使用增强for循环遍历Set集合
        for(Integer key:map.keySet()){
            String value = map.get(key);
            System.out.println (key+"="+value);

        }

    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        //1,使用Map集合中的方法entrySet（），把Map集合中多个Entry对象取出来，存储到一个Set集合中。
           Set<Map.Entry<Integer,String>> set = map.entrySet();
           //2,遍历Set集合，获取每一个Entry对象
        Iterator<Map.Entry<Integer,String>> iterator =set.iterator();
        //使用迭代器遍历
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            //3,使用Entry对象中的方法 getKey（）和getValue( )获取键与值。
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

         //使用增强for循环遍历Set集合
        for(Map.Entry<Integer,String> entry : set){
            Integer key = entry.getKey();
            String value =entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
