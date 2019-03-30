class Outter{
    private String msg="hello";
    public void fun(int num){
        public class Inner{//此处报错 方法内部类不能使用任何访问权限修饰符

        }
    }
}
public class Test13{
    public static void main(String[] args){
        Outter out = new Outter();
        out.fun(20);
    }
}
