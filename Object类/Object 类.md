#Object 类 （最高参数统一化）

Object类是JDK默认提供的一个类。java中除了Object类，所有类都存在继承关系，默认会继承Object父类；

当一个类的参数用object 接收，可以接收任何参数；

所有类的对象都可以使用Object 进行接收。Object类是参数的最高统一类型。

## 1.方法

### 1.1构造方法

```java
public Object()；//无参构造
    //空实现 为子类服务，让子类可以创建对象
```

### 1.2 取得对象的信息（toString的核心目的）

```java
public String toString();
//Object类中toString（）只是简单输出当前所引用的类名称以及对象地址。如果想在类中取得本类属性信息，需要覆写toString（）；
```

```java
package Test;

class Person{
    private String name;
    private int age;

    Person(String name, int age) {//构造方法
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
```

![](E:\javaclass\toString方法.png)

​        由打印结果知，由于String类覆写了Object的toString（）方法 ，所以打印的是字符串的值，而Person类没有覆写O**bject类的toString()方法**  **打印的是类名和 对象地址(类名@地址哈希码 )，如需在类中取得取得本类信息，需要覆写toString（）；**

**系统输出  System.out.println();  默认调用对象的toString（) 方法**  ,如果对象所在类没有覆写toString方法 则调用Object类中的toString方法。

当在Person中覆写toString（）方法

```java
//在上述Person类中覆写toString（）
public String toString(){
        return "name:"+this.name+" age:"+this.age;
    }
```

![1555588548200](E:\javaclass\普通类覆写toString类.png)



String作为信息输出的重要数据类型，在java中所有的数据类型只要遇见了String并且执行了 + ，那么都要求将其变成字符串后连接，而所有对象要想变为字符串就默认使用toString()方法。

### 1.3 对象比较

“ == ”对于基本数据类型来说比较的是两个操作数的值，对于引用数据类型而言比较的是两者指向的堆内存地址是否相同。

```java
//Object类内部的  equalsa方法
public boolean equals(Object obj){
    return (this==obj);//判断当前对象地址与传入对象地址是否一致
}
```

 ```java
package Test;
//覆写equals  实现可以比较一个类的属性值是否相等
class Person{
    private String name;
    private int age;
    
    Person(String name, int age) {//构造方法
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
         //1.判断传入的对象是否为null
         if(obj==null){
             return false;
         }
        //2.判断obj是否是Person类对象
        //因为接收的参数为Object类型，Object可以指向任意类，可能不是Person类
       if(!(obj instanceof Person)){//判断obj是不是Person类的对象
           return false;
       }
       //3.判断当前对象是否和传入的对象地址相同：指向同一地址（为同一对象）不需要比较值
        if(this == obj){//==比较两个引用类型的地址
            return true;
        }
        //4.obj是Person对象，比较属性内容
        //向下转型取得Person属性值
        Person per  =(Person) obj;
        return this.name.equals(per.name)&&(this.age==per.age);
    }
}
public class Test7 {
    public static void main(String[] args) {
        Person per1 = new Person("Aamanda",19);
        Person per2 = new Person("dabe",23);
        System.out.println(per1.equals(per2));//equals已被覆写，可以比较属性值 
    }  
}

 ```

> instanceof  （）：java中的保留关键字  它的作用是判断其左边对象是否为其右边类的实例，返回boolean类型的数据 。

##  2.接收引用数据类型

Object类可以接收任意类对象，因为Object类是所有类的父类；除此之外，Object类可以接收任意数据类类型（包括引用数据类型） 包括 类、数组、接口 

### 2.1 Object类接收数组

```java
package Test;
public class Test10 {
    public static void main(String[] args) {
        //Message message = new messageImpl();//子类对象向父接口转型
        Object object = new int[]{1, 3, 5, 7, 9};//Object类接收一个数组
        int[] data = (int[]) object;//强制转换为 int[]
        System.out.println(data.length);
    }
}
```

### 2.2 Object类接收接口对象

```java
package Test;

interface Message{//接口
    void getMessage();//抽象方法
}

class messageImpl implements Message{//子类实现接口
    public String toString(){
        return "helloworld!";
    }
    public void getMessage(){
        System.out.println("helloworld!");
    }
}

public class Test10 {
    public static void main(String[] args) {
        Message message = new messageImpl();//子类对象向父接口转型
        Object obj =message;//Object类接收 接口对象
        System.out.println(obj);        
        Message temp =(Message) obj;//强制类型转换
        temp.getMessage();
    }
}
```

