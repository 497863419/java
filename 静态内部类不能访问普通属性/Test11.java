//静态内部类可以拥有普通属性，但是不能访问外部类的普通属性
//静态内部类可以拥有静态域，但是不能访问外部类的非静态域；
class Outter{
    private  String msg="Hello world！";//msg必须为静态，不能为非静态
    static class Inner{//定义一个内部类
        private static String msg1="ycy";//可以拥有静态域
        private int age=19;
        public void print(){
            System.out.println(msg);//调用msg属性 // 此时报错msg必须为static属性
        }
        public void fun(){//可以拥有普通方法
            Inner in = new Inner();
            in.print();
        }
    }
}
public class Test11{
    public static void main(String[] args){
     Outter.Inner in = new Outter.Inner();//在外部类外部创建静态内部类对象
     in.print();
    }
}