class Person{
    public void print(){
        System.out.println("1.我是爸爸");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.我是儿砸！");
    }
    public void fun(){
        System.out.println("3.只有儿砸有！");
    }
}
public class Text9{
    public static void main(String[] args){
        Person per = new Student();//向上转型
        System.out.println(per instanceof Person);
        System.out.println(per instanceof Student);
        if (per instanceof Student){
            Student stu = (Student) per;
            stu.fun();
        }else{
            per=new Student();
        }
        //per.print();
        //Student stu = (Student) per;//向下转型
        //stu.fun();
    }
}