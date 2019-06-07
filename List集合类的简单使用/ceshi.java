import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * @Name： List集合类使用
 * @Author：ZYJ
 * @Date：2019-06-07-19:19
 * @Description:
 */
public class ceshi {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.contains(3));
        System.out.println(list.set(1,2));
        System.out.println(((LinkedList<Integer>) list).remove(new Integer(3)));
        System.out.println(list.remove(1));
        System.out.println(list);

    }
}
