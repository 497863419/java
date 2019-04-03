abstract class A{
    public abstract void fun();
    abstract class AInner{
       abstract void fun1();
    }
}
class B extends A{
    /*public void fun(){
        System.out.println("0000");
    } */
    public void fun1(){};//覆写内部类抽象方法  此时程序报错！！！！

}
public class Test23{
    public static void main(String[] args){

    }
}
