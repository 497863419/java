abstract class Person{
    private int num;
    public void fun(){
        System.out.println("*******");
    }
}
class Student extends Person{
    public void fun(){
        System.out.println("&&&&&&&");
    }
}
public class Test22{
    public static void main(String[] args){
        Person per = new Person();
    }
}