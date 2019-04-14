package Factory;
//工厂方法模式

//一个抽象产品类
interface Computer{
    void printComputer();
}
//多个具体产品类
class MacBookProComputer implements Computer {
    public void printComputer(){
        System.out.println("这是一个MacBookProComputer");
    }
}
class SurfaceComputer implements Computer{
    public void printComputer(){
        System.out.println("这是一个 SurfaceComputer");
    }
}

//一个抽象工厂
interface ComputerFactory{
    Computer createComputer();
}
//多个具体工厂
class AppleFactory implements ComputerFactory{
    public Computer createComputer(){
        return new MacBookProComputer();
    }
}
class MSFactory implements ComputerFactory{
    public Computer createComputer(){
        return new SurfaceComputer();
    }
}

public class Client {
    public void buyComputer(Computer computer){//买电脑
        computer.printComputer();
    }
    public static void main(String[] args){
        Client client = new Client();
        ComputerFactory factory = new AppleFactory();
        ComputerFactory factory1 = new MSFactory();
        client.buyComputer(factory.createComputer());
        client.buyComputer(factory1.createComputer());
    }

}
