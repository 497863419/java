import java.util.HashSet;
import java.util.Set;

/**
 * @Name：  HashSet的使用
 * @Author：ZYJ
 * @Date：2019-06-20-20:41
 * @Description:
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set<String>  set = new HashSet<>();
        set.add("hello");
        set.add("java");
        set.add("hello");
        set.add("world");
        System.out.println(set);
    }
}
