class Person{
    public void print(){
        System.out.println("1.Person类的print方法");
    }
}
class  Student extends Person{
    public void print(){
        System.out.println("2.Student类的print方法");
    }
}
public class Text7{
    public static void main(String[] args){
        Person per = new Student();
        per.print();
    }
}