package Test;
//定义一个包装类
class IntDemo{
    private int num;
    public IntDemo(int num){//构造方法
        this.num=num;
    }
    public int intValue(){
        return this.num;
    }
}

public class Test12 {
    public static void main(String[] args) {
        Object obj = new IntDemo(34);
        IntDemo demo = (IntDemo) obj;
        System.out.println(demo.intValue());
    }
}
