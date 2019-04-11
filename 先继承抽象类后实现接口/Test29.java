interface IMessage{//定义一个接口
    static final String MSG = "hello  java";//全局常量
    abstract void print();
}
abstract class News{
    public abstract void getMsg();
}
class MessageImpl extends News implements IMessage{
    public void print(){
       System.out.println("接口的抽象方法！");
    }
    public void getMsg(){
        System.out.println("抽象类的抽象方法！");
    }
    
} 
public class Test29{
    public static void main(String[] args){
        IMessage m = new MessageImpl();
        m.print();//
        //父接口与父类的相互转换
        News news = (News) m;
        news.getMsg();
        
    }
}
