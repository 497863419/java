class Person{
    public void  print() {
       System.out.println("1.Person类的print方法"); 
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.Student类的print方法");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("3.Worker类的Print方法");
    }
}
public class Text6{
    public static void main(String[] args){
        fun(new Person());//Person per = new Person();
        fun(new Student());//Person per = new Student();//向上转型   Student类 转为 Person类
        fun(new Worker());//Person per = new Worker();//向上转型     Worker 类 转为 Person类
    }
    public static void fun(Person per){
        per.print();
    }

}
//运行结果：
//1.Person类的print方法
//2.Student类的print方法
//3.Worker类的Print方法