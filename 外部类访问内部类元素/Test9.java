class Outter{
    class Inner{
        public void display(){
            System.out.println("I am InnerClass");
        }
    }
    public void display(){
        Inner inner = new Inner();
        inner.display();
    }
}
public class Test9{
    public static void main(String[] args){
       Outter out = new Outter();
       out.display();
    }
}