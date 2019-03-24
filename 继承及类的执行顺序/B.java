class A{
    static{
        System.out.println("1.A类的静态块");
    }
    {
        System.out.println("2.A类的构造块");
    }
    public A(){
        System.out.println("3.A类的构造方法");
    }
}
public class B extends A{
    static{
        System.out.println("4.B类的静态块");
    }
    {
        System.out.println("5.B类的构造块");
    }
    public B(){
        System.out.println("6.B类的构造方法");
    }
    public static void main(String[] args){
    System.out.println("------start------");
     new A();
     new B();
     System.out.println("------end------");
    }
}