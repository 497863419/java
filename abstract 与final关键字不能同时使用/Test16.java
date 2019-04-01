//抽象类的定义与使用
abstract final class Person{//此处报错 abstract 与final关键字不能同时是使用
    static int num=10;
    public abstract void print();
} 
public class Test16{
    public static void main(String[] args){
        System.out.println(Person.num);
    }
}