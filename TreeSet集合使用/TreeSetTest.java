import java.util.Set;
import java.util.TreeSet;

/**
 * @Name： TreeSet集合的使用
 * @Author：ZYJ
 * @Date：2019-06-20-20:43
 * @Description:
 */
public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("B");
        set.add("E");
        set.add("C");
        set.add("A");
        System.out.println(set);
    }
}
