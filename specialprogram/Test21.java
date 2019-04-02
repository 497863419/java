abstract class A{
    public A(){//3.调用父类构造方法
        this.print();//4.调用父类方法，方法被子类覆写
    }
    public abstract void print();
}
class B extends A{
    private int num=100;
    public B(int num){//2.调用子类构造方法
        super();//3.隐含调用父类构造方法
        this.num=num;//为类中属性初始化
    }
    public void print(){//5.调用覆写后的方法。此时子类对象的属性没有被初始化（对象初始化操作在构造方法中执行）
        System.out.println(this.num);//6.打印数据为数据类型的默认值
    }
}
public class Test21{
    public static void main(String[] args){
        new B(30);//1.实例化子类对象
        new B(30).print();//修改代码后
    }
}