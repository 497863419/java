import java.util.Scanner;

abstract class CaffeineBeverage {// 核心算法
    final void prepareRecipe(){//该类不会被子类覆盖//定义标准 不可修改
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
        print();
    }
    /**
      抽象方法 必须由子类实现
      */
    abstract void brew();
    abstract void addCondiments();
    abstract void print();
    /*
       具体操作且共用的方法，定义在父类中，可被模板方法或子类直接直接使用
    */
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cuo");
    }
    /*
       钩子方法 “默认不做事”  父类中通常默认实现 子类视情况决定要不要覆盖
    */
    boolean customerWantsCondiments(){
        return true;
    }
    
}
/*
子类实现
*/
class Tea extends CaffeineBeverage{
    void brew(){
        System.out.println("Steeping the tea");
    }
    void addCondiments(){
        System.out.println("Adding lemon");
    } 
    void print(){
        System.out.println("您的茶好了！");   
    }     
}
class Coffee extends CaffeineBeverage{
     void brew(){
         System.out.println("Dripping Coffee through filter");
     }
     void addCondiments(){
         System.out.println("Adding Suger and Milk");
     }   
    /*
    子类覆写钩子方法，实现字定义功能
    */
    public boolean customerWantsCondiments(){//覆写钩子方法
        String answer = getUserInput();//定义一个方法   用于与客户反馈
        if(answer.equals("y")){
            return true;
        }else{
            return false;
        }
    }
    private String getUserInput(){//实现该方法  设置反馈语句
        String answer = null;
        System.out.println("您想要在咖啡中加入牛奶或糖吗 (y/n)?");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        return answer;
    }
    void print(){
        System.out.println("您的咖啡好了！");   
    }   
}
public class Test26{
    public static void main(String[] args){
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        

        System.out.println("\nMaking Coffee...");
        coffee.prepareRecipe();
    }
}