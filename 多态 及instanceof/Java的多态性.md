

# Java的多态性

在java中，多态的核心表现在以下两点：

## **·方法的多态性**：

**方法的重载（overload）**：发生在同一类中，方法名称相同，参数个数、类型不相同。没有权限要求。即同一个方法名称可以根据参数类型或个数不同调用不同的方法体。

**方法的覆写(override)**：发生在有继承关心的类之间，方法名称、参数个数、类型全相同。子类的方法权限>=父类方法权限。同一个父类方法，可以根据实例化子类的不同也有不同的实现

##·对象的多态性：

**· 向上转型【自动转  90%】：父类 父类对象 = 子类实例；**

**通过对象向上转型可以实现接受参数的统一。**

```java
//向上转型
class Person{
    public void print(){
        System.out.println("1.Person类的print方法");
    }
}
class  Student extends Person{
    public void print(){
        System.out.println("2.Student类的print方法");
    }
}
public class Text7{
    public static void main(String[] args){
        Person per = new Student();//向上转型
        per.print();
    }
}
//运行结果：
//2.Student类的print方法
```

```java
//参数统一化
class Person{
    public void  print() {
       System.out.println("1.Person类的print方法"); 
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.Student类的print方法");
    }
}
class Worker extends Person{
    public void print(){
        System.out.println("3.Worker类的Print方法");
    }
}
public class Text6{
    public static void main(String[] args){
        fun(new Person());//Person per = new Person();
        fun(new Student());//Person per = new Student();//向上转型   Student类 转为 Person类
        fun(new Worker());//Person per = new Worker();//向上转型     Worker 类 转为 Person类
    }
    public static void fun(Person per){
        per.print();
    }

}
//运行结果：
//1.Person类的print方法
//2.Student类的print方法
//3.Worker类的Print方法
```

是否发生了向上转型的核心在于：你使用哪一个类进行new，并且调用的方法是否被覆写。

**· 向下转型【强转 1%】：子类 子类对象 = （子类）父类实例；**

向下转型可以实现子类扩充方法调用（有安全隐患，一般不操作！）；****

**父类需要子类扩充的属性或方法时需要向下转型；**

```java
//向下转型 将父类对象转为子类
class Person{
    public void print(){
        System.out.println("1.我是爸爸！");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.我是儿砸！");
    }
    public void fun(){
        System.out.println("3.只有儿砸有！");
    }
}
public class Text8{
    public static void main(String[] args){
      Person per = new Student();//向上转型 
      per.print();//能够调用的只有父类已定义好的
      
      Student stu = (Student) per;//向下转型
      stu.fun();//
    }
}
```

并不是所有父类都可以向下转型，如果想要向下转型之前，一定要首先发生向上转型过程，否则会出现ClassCastException（类型转换异常 属于运行时异常）。

两个没有关系的类是不能发生转型的，一定会产生ClassCastException.

## instanceof类 

作用：检查当前对象是否能指向目标类，返回值为Boolean。

```java
class Person{
    public void print(){
        System.out.println("1.我是爸爸");
    }
}
class Student extends Person{
    public void print(){
        System.out.println("2.我是儿砸！");
    }
    public void fun(){
        System.out.println("3.只有儿砸有！");
    }
}
public class Text9{
    public static void main(String[] args){
        Person per = new Student();//向上转型
        System.out.println(per instanceof Person);
        System.out.println(per instanceof Student);
        if (per instanceof Student){//检查是否可转
            Student stu = (Student) per;
            stu.fun();
        }else{
            per=new Student();
        }
        //per.print();
        //Student stu = (Student) per;//向下转型
        //stu.fun();
    }
}
```



