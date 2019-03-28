class Outter{
    private String msg="外部类的私有属性！";
    class Inner{
        private String msg1="Inner中的私有属性！";
        public void fun(){
            //内部类访问外部类的私有属性
            System.out.println(msg);
        }
    }
    public void test(){
        Inner in = new Inner();
        System.out.println(in.msg1);
    }
}
public class Test7{
    public static void main(String[] args){
        Outter out = new Outter();
        out.test();
    }
}