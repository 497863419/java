class Person{
    public void fun(){
      this.print();  
    }
    private void print(){//用private修饰，此方法仅限父类使用，子类无法得知此方法存在
        System.out.println("1.[Person]类的print方法");
    }
}
class Student extends Person{
    public void print(){//此时该方法是类定义的新方法，与父类方法无关
        System.out.println("1.[Student]类的print方法");
    }
}
public class Text2{
    public static void main(String[] args){
        new Student().fun();
    }
}
//运行结果为：1.[Person]类的print方法；