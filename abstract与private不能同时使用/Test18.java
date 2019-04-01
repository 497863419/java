abstract class Person{
   private abstract  void print();//此处报错 private和abstract 不能同时使用
}
class Student extends Person{
     public void print(){
     System.out.println("hello world");
   }
}
public class Test18{
    public static void main(String[] args){
        Person per = new Student();//当有抽象类和接口是一定使用的是抽象类或接口对象，
        //因为调用的是被覆写后的
       // per.print();
    }
} 