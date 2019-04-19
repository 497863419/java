package Test;

class Person{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "name:"+this.name+" age:"+this.age;
    }
}
public class Test7 {
    public static void main(String[] args) {
        fun(new Person("Amanda",21));
        fun("Hello");//由于String类覆写了Object类的toString 方法
    }
    public static void fun(Object object){
        System.out.println(object.toString());
    }
}
