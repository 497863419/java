# this关键字

1.this表示本类属性:

## #2.this调用本类方法

1）调用普通方法  this.方法名称（参数）

```java
class Person{
    private String name;
    private int age;
    public Person(String name,int age){
       this. name=name;//形参自己调用自己。
        this.age=age;
    }
    public String getPersonInfo(){
        return "姓名："+name+",年龄："+age;
    }
}
public class Test13{
    public static void main(String[] ages){
       Person per=new Person("ycy",20);
       System.out.println(per.getPersonInfo());
    }
}
```



2）调用构造方法：this（参数）

```java
class Person{
    private  String name;
    private   int age;
    public Person(){//构造方法
        System.out.println("*******1.产生一个新的Person对象********");
    }
    public Person(String name){//有一个参数的构造方法（构造方法重载）
        //System.out.println("*******2.产生一个新的Person对象********");
        this();//调用本类无参构造
        this.name=name;
    }
    public Person(String name,int age){//两个参数的构造方法（构造方法重载）
        //System.out.println("*******3.产生一个新的Person对象********");
        this(name);//调用本类有参构造
        //this调用构造方法的语句必须在构造方法首行
        //this.name=name;
        this.age=age;
       // this();
    }
    public String getPersonInfo(){
        return "姓名："+name+",年龄："+age;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person per1=new Person();
        Person per2=new Person("张三");
        Person per3=new Person("李四",30);
        System.out.println(per1.getPersonInfo());
        System.out.println(per2.getPersonInfo());
        System.out.println(per3.getPersonInfo());
    }
}

```

**this调用构造方法有两个注意：**

**（1）.this调用构造方法语句必须在构造方法首行**

**（2）.this调用构造方法时，必须留有出口（不能成环）**

**3）.表示当前对象**

```java
class Person{
    public void print(){
        System.out.println("[PRINT]方法："+this);
    }
}
public class Test14{
    public static void main(String[] args){
        Person p1=new Person();  
        System.out.println("[MAIN]方法："+p1);
        p1.print();
        System.out.println("------------------");
        Person p2=new Person();
        System.out.println("[MAIN]方法："+p2);
        p2.print();
    }
}
//运行结果
[MAIN]方法：Person@27082746
[PRINT]方法：Person@27082746
------------------
[MAIN]方法：Person@66133adc
[PRINT]方法：Person@66133adc
```

只要调用了本类中的方法，这个this就表示当前执行的对象

