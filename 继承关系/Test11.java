//定义一个抽象类
abstract class Person{
    private String name;//属性
    //private double salary;
    //private int age;
    public void setName(String n){//普通方法
        this.name=n;
    }
    public String getName(){
      return name;
    } 
    public abstract void getPersonInfo();//抽像方法

    
} 
class Student extends Person{//子类 
    public void getPersonInfo(){//覆写抽象方法
        System.out.println("是一个学生");
    }
}
public class Test11{
    public static void main(String[] args){
      Person per = new Student();//实例化 //向上转型
      per.getPersonInfo();//调用被子类覆写的方法
    }
}