class A{
    private String name="A类的私有域";
    public String getName(){//6.父类A的getName()方法
        return name;//返回name
    }
}
class B{
    private int age=20;
    public int getAge(){//6.父类B的getAge()方法
        return age;//返回age
    }
}
class Outter{
    public class InnerClassA extends A{//类
        public String name(){//4.调用InnerClassA类的name 方法 
            return super.getName();//5.返回父类getName()方法
        }
    }
    public class InnerClassB extends B{
        public int age(){//4.调用InnerCalssB类的age()方法  
            return super.getAge();//5.返回父类getAge()方法
        }
    }
    
    public String name(){//3.name()方法返回 InnerClassA类的name()方法
        return new InnerClassA().name();
    }
    public int age(){//3.age()方法返回 InnerCalssB类的age()方法
        return new InnerClassB().age();
    }
    
}
public class Test5{
    public static void main(String[] args){
        Outter outter = new Outter();//1.实例化一个Outter类对象 outter
        System.out.println(outter.name());//2.调用Outter类中name()方法
        System.out.println(outter.age());//2.调用Outter类中age()方法
    }
}