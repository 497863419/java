interface A{//接口A
    void PlayA();
}
interface B{//接口B
    void PlayB();
}
interface C extends A,B{//接口C继承接口A，B  接口可以实现多继承
    void PlayC();
}
class CImpl implements C{//子类实现接口
    public void PlayA(){//覆写接口抽象方法
        System.out.println("接口A的抽象方法");
    }
    public void PlayB(){//覆写接口抽象方法
        System.out.println("接口B的抽象方法");
    }
    public void PlayC(){//覆写接口抽象方法
        System.out.println("接口C的抽象方法");
    }
}
public class Test30{
    public static void main(String[] args){
        CImpl c = new  CImpl();
        c.PlayA();
        c.PlayB();
        c.PlayC();
    }
}