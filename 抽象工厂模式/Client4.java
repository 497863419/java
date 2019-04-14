package Factory4;


//多个抽象产品类
interface  Computer{
    void printComputer();
}
class DellComputer implements Computer {
    public void printComputer() {
        System.out.println("这是一个DELL电脑");
    }
}
class HuaWeiComputer implements  Computer{
    @Override
    public void printComputer() {
        System.out.println("这是一个HUAWEI电脑");
    }
}

interface OperatingSystem{
    void printSystem();
}
class Win10System implements OperatingSystem {
    public void printSystem() {
        System.out.println("这是以一个Win10操作系统");
    }
}
class OsSystem implements OperatingSystem{
    public void printSystem(){
        System.out.println("这是一个OS操作");
    }
}


//抽象工厂类
interface  ComputerFactory{
    //提供创建一系列相关或相互依赖对象的接口
    Computer createComputer();//返回值为电脑类的方法
    OperatingSystem createSystem();//返回值为操作系统的方法
}
//具体工厂类
class DellFactory implements ComputerFactory{
    public Computer createComputer(){
        return new DellComputer();
    }
    public OperatingSystem createSystem(){
        return new Win10System();
    }
}
class HuaWeiFactory implements ComputerFactory{
    public Computer createComputer(){
        return new HuaWeiComputer();
    }
    public OperatingSystem createSystem(){
        return new OsSystem();
    }
}

public class Client4 {
    public void buyComputer(Computer computer){
        computer.printComputer();
    }
    public void use(OperatingSystem system){
        system.printSystem();
    }
    public static void main(String[] args){
        Client4 client4 = new Client4();//客户端

        ComputerFactory factory = new DellFactory();//子类向上转型  实例化工厂
        Computer computer = factory.createComputer();//实例化一个产品
        OperatingSystem system = factory.createSystem();
        client4.buyComputer(computer);
        client4.use(system);

        ComputerFactory factory1 = new HuaWeiFactory();
        Computer computer1 = factory1.createComputer();
        OperatingSystem system1 =factory1.createSystem();
        client4.buyComputer(computer1);
        client4.use(system1);

    }
}
