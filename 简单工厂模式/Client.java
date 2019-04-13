import java.util.Scanner;

interface  Computer{//定义一个抽才产品类
    void printComputer();//抽象方法
}
class MacBookProComputer implements Computer{//定义一个类实现接口
    public void printComputer(){//覆写接口抽象方法
        System.out.println("这是一个 MacBookPro");
    }
}
class SurfaceBookComputer implements Computer{//定义一个类实现接口
    public void printComputer(){//覆写接口抽象方法
        System.out.println("这是一个 SurfaceBook");
    }
}
class ComputerFactory{//工厂类
    public static Computer getInstance(String type){
        Computer computer =null;
        if(type.equals("MacBookPro")){
            computer = new MacBookProComputer();
        }else if(type.equals("SurfaceBook")){
            computer = new SurfaceBookComputer();
        }
        return computer;
    }

}
public class Client {//客户端
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
    public static void main(String[] args){
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想要的电脑型号");
        String type = scanner.nextLine();
        Computer computer = ComputerFactory.getInstance(type);
        client.buyComputer(computer);

    }
}

