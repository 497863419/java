class Outter{
    private String msg="hello";
    public void fun(int num){
        class Inner{//此处报错 方法内部类不能使用任何访问权限修饰符

        }
    }
    public void test(){
        Inner in = new Inner();//此处报错，已出方法，不可以使用 Inner（）
    }
}
public class Test13{
    public static void main(String[] args){
        Outter out = new Outter();
        out.test();
        out.fun(20);
    }
}
