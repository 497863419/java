class Person{
    public void print(){
        System.out.println("1.[Person]类的print方法");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.[Student]类的Print方法");
    }
}
public class Text1{
    public static void main(String[] args){
        new Student().print();
    }
}