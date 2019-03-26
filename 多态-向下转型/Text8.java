class Person{
    public void print(){
        System.out.println("1.我是爸爸！");
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
public class Text8{
    public static void main(String[] args){
      Person per = new Student();//向上转型 
      per.print();//能够调用的只有父类已定义好的
      
      Student stu = (Student) per;//向下转型
      stu.fun();//
    }
}