package www;

/**
 * @Name：主方法抛出异常
 * @Author：ZYJ
 * @Date：2019-05-09-20:55
 * @Description:
 */
public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println(calculate(10,0));
    }
    public static  int calculate(int x,int y)throws Exception{
        return x/y;
    }
}
