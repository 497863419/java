package Test.zyj.com;

/**
 * @Name：  泛型类与泛型方法同时存在
 * @Author：ZYJ
 * @Date：2019-06-01-15:52
 * @Description:
 */
public class FCaFF {
    public static void main(String[] args) {

        MyClass01<String> myClass01 = new MyClass01<>();//传入String类
        myClass01.testMethod("只能是String类型");
        //调用泛型方法 ，传入整形数据类型
        Integer i = myClass01.testMethod2(100);
        System.out.println(i);
        //调用泛型方法，传入字符串类型数据
        String s = myClass01.testMethod2("sdasd");
        System.out.println(s);
    }
}

/**
 * 定义泛型类  实例化对象传入什么类型就是什么类型
 * @param <T>
 */
class MyClass01<T>{
    /**
     * 定义泛型方法
     * 在调用方法的时候确定泛型的数据类型，传递什么参数，泛型就是什么类型
     * @param t
     */
    public <T> T testMethod2(T t){
        return t;
    }

    /**
     * 普通方法
     * @param t
     */
    public void testMethod(T t){
        System.out.println(t);
    }
}
