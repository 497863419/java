package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Name：
 * @Author：ZYJ
 * @Date：2019-06-22-21:14
 * @Description:
 */
public class MapDemo {
    public static void main(String[] args) {
        //实例化Map对象
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"java");
        map.put(3,"hello");
        map.put(4,"world");
        //得到key  key为set集合
        Set<Integer> key = map.keySet();
        //取得迭代器
        Iterator<Integer> iterator = key.iterator();

        while (iterator.hasNext()){
            Integer i = iterator.next();
            //使用 get方法 得到key对象的value
            System.out.println(i+"="+map.get(i));
        }
    }
}
