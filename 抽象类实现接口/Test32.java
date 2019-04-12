interface IMessage{
    void print();
}
abstract class News implements IMessage{//抽象类实现接口
    //News 为抽象类，可以覆写 IMessage 中的抽象方法
    //抽象类中的方法前面abstract 不能省略，否则就是普通方法
    public abstract void getNews();//抽象类中的抽象方法
}
class MessageImpl extends News{//子类实现接口
    //覆写接口中所有的抽象方法
    public void print(){
        System.out.println("子类覆写接口中的抽象方法！");
    }
    public void getNews(){
        System.out.println("子类覆写抽象类中的抽象方法！");
    }

}
public class Test32{
    public static void main(String[] args){
        MessageImpl messageImpl = new MessageImpl();
        messageImpl.print();
        messageImpl.getNews();
    }
}