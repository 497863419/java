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

    public boolean equals(Object obj){
        //1.首先判断obj是否是Person类对象
        //因为接收的参数为Object类型，Object可以指向任意类，可能不是Person类
       if(!(obj instanceof Person)){//判断obj是不是Person类的对象
           return false;
       }
       //2.判断当前对象是否和传入的对象地址相同：指向同一地址（为同一对象）不需要比较值
        if(this == obj){//==比较两个引用类型的地址
            return true;
        }
        //3.obj是Person对象，比较属性内容
        //向下转型取得Person属性值
        Person per  =(Person) obj;
        return this.name.equals(per.name)&&(this.age==per.age);
    }
}
public class Test8 {
    public static void main(String[] args) {

        Person per1 = new Person("Aamanda",19);
        Person per2 = new Person("dabe",23);
        System.out.println(per1.equals(per2));//equals已被覆写，可以比较属性值


        /*fun(new Person("Amanda",21));
        fun("Hello");//由于String类覆写了Object类的toString 方法*/
    }
    /*public static void fun(Object object){
        System.out.println(object.toString());
    }*/
}
