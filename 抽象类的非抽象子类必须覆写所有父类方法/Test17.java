abstract class Person{
    abstract void print();
    abstract void fun();
}
class Student extends Person{//此处报错应覆写所有方法
    static int num=10;
    public void print(){}
    //public void fun(){}
}
public class Test17{
    public static void main(String[] args){
       // Person per = new Student();
    //Student stu = new Student(); 
    System.out.println(Student.num);
    }
}