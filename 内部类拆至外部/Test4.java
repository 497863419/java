class Outter{
    private String msg = "Hello World";
    public String getMsg(){
        return this.msg;
    }
    public void fun(){//3.out调用fun（）方法
        Inner in = new Inner(this);//4.this 表示 out
        in.print();//7.调用方法
    }
}
class Inner{
    private Outter out;
    public Inner(Outter out){//5.Inner.out = main.out;
        this.out = out;//6.引用传递
    }
    public void print(){//8.执行该方法
        System.out.println(out.getMsg());
    }
}
public class Test4{
    public static void main(String[] args){
        Outter out = new Outter();//1.创建一个Outer对象
        out.fun();//2.调用Outter类fun（）方法
    }
}