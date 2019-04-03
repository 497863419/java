abstract class A{
    public abstract void print();
    static abstract class B{//内部抽象类
        public abstract void printB();
    }
}
class C extends A.B{
    public void printB(){};
}
public class Test25{
    public static void main(String[] args){
      C c = new C(); 
    }
}