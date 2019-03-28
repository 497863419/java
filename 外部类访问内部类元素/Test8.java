class Outter{
    private String msg="Outter的私有属性";
    class Inner{
        private String msg1="Inner的私有属性";
        public void fun(){
            System.out.println(msg);
        }
    }
    public void test(){
        //外部类访问内部类元素，需要通过内部类引用来访问
       Inner in = new Inner();
       in.fun();
    }
}
public class Test8{
    public static void main(String[] args){
        Outter out = new Outter();
        out.test();
    }
}
