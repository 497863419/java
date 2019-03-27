class Outter{
    private String msg = "Hello World!";
    class Inner{//内部类
       public void print(){//内部类方法
        System.out.println(msg);//可以直接访问外部类的成员属性
       }
    }
    public void fun(){//外部类方法
        Inner in = new Inner();//外部类方法中创建一个内部类对象
        in.print();//内部类对象调用内部类方法
    }
}
public class Test3{
    public static void main(String[] args){
        Outter out = new Outter();//创建外部类对象
        out.fun();//外部类对象调用外部内方法
    }
}