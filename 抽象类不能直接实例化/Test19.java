abstract class Person{
   public abstract void print();
  
}
class Student extends Person{
    public void print(){
        System.out.println("hello i am student");
    }
}
public class Test19{
    public static void main(String[] args){
        Person per = new Student();
        //Person per = new Person();//该语句为错误写法
        per.print(); 
    }
}