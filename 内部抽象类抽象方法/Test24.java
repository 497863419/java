abstract class A{
    public abstract void funA();
    abstract class AInner{
        public abstract void funB();
    }
}
class B extends A{
    public void funA(){};
    class BInner extends AInner{
        public void funB(){};
    }
}
public class Test24{
    public static void main(String[] args){

    }
}