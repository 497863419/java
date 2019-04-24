package bittech.DS;

/**
 * @Name：测试类
 * @Author：ZYJ
 * @Date：2019-04-24-19:09
 * @Description: 测试自定义的线性表
 */
public class Testmain {
    public static void main(String[] args) {
        Sequence sequence= new SequenceArrayImpl(5);
        sequence.add(1);
        sequence.add(2);
        sequence.add(3);
        //System.out.println(sequence.Size());
        System.out.println(sequence.contains(4));
        sequence.set(2,20);
        System.out.println(sequence.get(2));




    }
}
