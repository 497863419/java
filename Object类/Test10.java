package Test;

interface Message{//接口
    void getMessage();//抽象方法
}
class messageImpl implements Message{//子类实现接口
    public String toString(){
        return "hello";
    }
    public void getMessage(){
        System.out.println("world!");
    }
}

public class Test10 {
    public static void main(String[] args) {

        /*Object object = new int[]{1, 3, 5, 7, 9};//Object类接收一个数组
        int[] data = (int[]) object;//强制转换为 int[]
        System.out.println(data.length);*/

        Message message = new messageImpl();//子类对象向父接口转型
        System.out.println(message);
        //系统输出语句默认调用toString方法  若不覆写 调用Object类中的toString方法
        Object obj =message;//Object类接收 接口对象
        System.out.println(obj);
        Message temp =(Message) obj;//强制类型转换
        temp.getMessage();

    }
}
