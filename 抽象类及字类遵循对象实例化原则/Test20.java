abstract class Person{
    private String  name;//属性
    public Person(){
       System.out.println("父类构造方法！");
    }
    public void setName(String name){//普通方法
       this.name=name;
    }
    public String getName(){//普通方法
       return name;
    }
    public abstract void print();//抽象方法
}
class Student extends Person{
    private int age;
    public Student(){//子类构造方法
       System.out.println("子类构造方法!");
    }

    public void setAge(int age){//子类普通方法
        this.age=age;
    }
    public int getAge(){//子类普通方法
        return age;
    }
    public void print(){//子类覆写的父类抽象方法
    //空实现
    }   
}
public class Test20{
    public static void main(String[] args){
        new Student();
    }
}