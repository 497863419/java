interface IMessage{//定义一个接口
    static final String MSG = "hello  java";//全局常量
    abstract void print();
}
class MessageImpl implements IMessage{
    void print(){
       System.out.println("接口的抽象方法！");
    }
    
} 
public class Test29{
    public static void main(String[] args){
        IMessage m = new MessageImpl();
        m.print();
    }
}
