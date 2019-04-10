interface  IMessage{
    public static final String MSG ="hello java";
    public abstract void print();
}
interface  INews{
    public abstract String getNews();
}
class MessageImpl implements IMessage,INews{
    public void print(){
        System.out.println(IMessage.MSG);
    }
    public String getNews(){
        return IMessage.MSG;
    }
}
public class Test1{
    public static void main(String[] args) {
        IMessage message =  new MessageImpl();
        message.print();
        INews news = (INews) message;//向上转型
        System.out.println(news.getNews());
    }
}
