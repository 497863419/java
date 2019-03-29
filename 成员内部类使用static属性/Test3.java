//成员内部类中不能有静态域，但是可以访问外部类的静态域
class Outter{
    private static String msg = "Hello World!";
    class Inner{//静态内部类
       private static String msg1="ycy";
       public void print(){
          System.out.println(msg);
       }
   }  
    public void fun(){
        Inner in = new Inner();
        in.print();
    }
}
public class Test3{
    public static void main(String[] args){
        Outter.Inner in = new Outter().new Inner();//外部类外部创建成员内部类对象
        in.print();
    }
}