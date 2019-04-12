interface A{
    void playA();
}
interface B{
    void playB();
}
interface C extends A,B{//接口C 继承接口A，B
    void playC();
}
abstract class CImpl implements C{ //抽象类实现接口C

}
class Test extends CImpl implements C{//普通类继承抽象类CImpl
    
     public void playA(){
         System.out.println("非抽象类覆写后方法playA");
     }//非抽象类覆写所有抽象方法
     public void playB(){}
     public void playC(){}
}
public class Test31{
    public static void main(String[] args){
        Test c = new Test();//向上转型
        c.playA();
    }
}