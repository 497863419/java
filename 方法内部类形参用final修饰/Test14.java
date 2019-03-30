class Outter{
    private String msg="hello";
    public void display(int num){//若方法要使用这个形参，这个形参必须使用final修饰（final修饰的参数不能修改）
        class Inner{
            public void fun(){
                num++;
                System.out.println(num);
                System.out.println(msg);//方法内部类可以访问外部类的私有属性
            }       
        }
        Inner in = new Inner();//定义在方法内部 方法内部类外部
        in.fun(); 
    }
   
}
public class Test14{
    public static void main(String[] args){
        Outter out = new Outter();
        out.display(20);
    }
}
