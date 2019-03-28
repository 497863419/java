//静态内部类可以拥有普通属性，但是不能访问外部类的普通属性
//普通内部类（成员内部类）不可以拥有静态属性，但是可以访问外部类的静态域
class Outter{
    private static String msg="Hello world！";
    static class Inner{//定义一个内部类
        public void print(){//此时只能是使用外部类中的static操作
            System.out.println(msg);//调用msg属性
        }
    }
    //在外部类中定义一个方法，该方法负责产生内部类对象并调用print（）方法
    public void fun(){
        Inner in = new Inner();//内部类对象
        in.print();//内部类提供的print（）方法
    }
}
public class Test11{
    public static void main(String[] args){
     Outter.Inner in = new Outter.Inner();
     in.print();
    }
}