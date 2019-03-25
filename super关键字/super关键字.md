### super关键字

作用范围：子类调用父类方法时使用。在进行方法覆写的操作过程中，子类可以使用super.方法（）/super.属性明确调用父类中的方法或属性。

```java
//使用super 调用父类同名方法
class Person{
    public void print(){
        System.out.print("1.I am a father");
    }
}
class Student extends Person{
    public void print(){
        super.print();//标售调用父类print（）
        System.out.println("2.I am a child");
    }
}
public class Text3{
    public static void main(String[] args){
        new Student().print();
    }
}
//运行结果  1.I am a father2.I am a child
```

**1.调用构造方法：**

1）**当调用子类的无参构造时**，系统会自动在子类无参构造中加 super（）语句，表示先调用父类无参构造。此时super（）语句可以省略，子类可以使用this调用构造方法。（super语句必须在构造器的首行，this调用构造方法时也必须在首行。）

2)**当父类不存在无参构造时**，必须在子类构造方法中使用super（参数），明确指定调用父类哪一个有参构造，此时super不能省略。此时子类不存在this调用构造方法。

**2.super调用普通方法**

super.方法名称（参数）：表示直接从父类中找到同名方法并调用。

**3.super调用普通属性**

super.属性名表示直接从父类中找到同名属性并调用

```java
class Person{
    public String info="爸爸！";
}
class Student extends Person{
    public String info="儿砸!";
    public void print(){
        System.out.println(super.info);//调用父类属性
        System.out.println(this.info);//调用本类属性
    }
}
public class Text4{
public static void main(String[] args){
    new Student().print();
}
}
//运行结果：
//爸爸！
//儿砸!
```

