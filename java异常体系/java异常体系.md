# java异常体系

## 1.异常的分类

![1557402810155](E:\javaclass\java异常体系.png)



### 1.1 运行时异常

### 1.2 编译时异常

![1557403187988](E:\javaclass\异常分类.png)

## 2.异常处理

### 2.1 JVM处理异常的方式

如果出现异常我们没有处理。JVM会帮我们进行处理，它会把异常的类型、原因以及发生的位置（包、类、方法）显示在命令行，并终止程序，异常后面的代码将不在执行

### 2.2 自己处理

#### 2.2.1 捕获处理

##### 1.try...catch 语句

```java
try{
    可能出现问题的代码
}catch(异常类  对象){
    处理异常
}
```

```java
public class ExceptionDemo{
    public static void main(String[] args){
        try{
            System.out.printlm(2/0);
        }catch(AritnmeticException e ){
            System.out.println("除0操作")；
        }
    }
}
```

**try..catch的执行顺序**

首先执行try语句，如果发现异常，异常下面 的代码将不再执行，直接跳入catch语句中，catch语句结束后，整个try...catch结束。若没有发现异常，try语句执行结束后，try...catch语句直接结束，不执行catch 语句



**处理多个异常方法**

1.多个try... catch 组合

```java
public class ExceptionDemo{
    public static void main(String[] args){
        try{
            String S=null;
            System.out.println(S.length);
        }catch(NullpointException n){
            System.out.println("空指针异常");
        }
        try{
            int[] arr = new int[4];
            System.out.println(arr[5]);
        }catch(ArrayIndexoutofBoundsException a){
            System.out.println("数组越界异常");
        }
    }
}
```

2.一个try 多个catch

```java
public class ExceptionDemo{
    public static void main(String[] args){
        try{
            String S=null;
            System.out.println(S.length);
            
            int[] arr = new int[4];
            System.out.println(arr[5]);
        }catch(NUllPointException e){
            System.out.println("空指针异常");
        }catch(ArrayIndexoutofBoundsException a){
            System.out.println("数组越界异常");
        }
    }
}
```

> **多个catch之间的执行顺序**
>
> **1）多个catch之间可以由继承关系 ，若存在继承关系，父类异常必须放在子类后**
>
> **2）平级之间没有异常**



**若try中的异常处理在catch中没有出现，程序依然会出现异常**

解决办法：

```java
catch(Exception e){//使用父类！
    System.out.println("出现异常！");;
}
```

##### 2.try...catch...finally 语句

finally 组合try...catch 语句使用 ，用于释放资源的收尾工作，无论try...catch 语句如何，finally中的语句一定会被执行。

```java
 try {
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally{
            System.out.println(6666);
        }
}
```

### 2.3 抛出去

当我们不想处理，或者没有能力处理异常时，我们可以选择抛出异常，**谁调用，谁抛出**

#### 2.3.1.throws 关键字

用在方法上  ；使用throws关键字在方法声明时抛出异常，

```java
package www;
/** 
 * @Name：抛出异常
 * @Author：ZYJ
 * @Date：2019-05-09-20:46
 * @Description:throws  处理异常
 */
public class ExceptionDemo {
    public static void main(String[] args) {
       try{
           System.out.println(calculate(10,0));
       }catch (Exception e){
           e.printStackTrace();
       }
    }
    public static int  calculate(int x,int y)  throws Exception{
        return x/y;
    }
}
```

主方法抛出异常：主方法本身也是一个方法，所有主方法也可以使用throws进行异常抛出，这个时候如果产生了异常就会交给JVM处理

```java
package www;

/**
 * @Name：主方法抛出异常
 * @Author：ZYJ
 * @Date：2019-05-09-20:55
 * @Description:
 */
public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println(calculate(10,0));
    }
    public static  int calculate(int x,int y)throws Exception{
        return x/y;
    }
}
```

#### 2.3.2 throw 关键字

throw直接编写在语句中，表示认为进行异常的抛出，如果异常类对象实例化不希望由JVM产生而由用户产生，就可以使用throw来完成

```java
package www;
/**
 * @Name：throw 关键字使用
 * @Author：ZYJ
 * @Date：2019-05-09-21:00
 * @Description:
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            throw new Exception("抛个异常玩~~~~");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

```

####  2.3.3 throwable类

定义

- ```java
  public class Throwable extends Object implements Serializable
  ```

- `Java语言中所有错误和异常都是Throwable`类。  只有作为此类（或其一个子类）的实例的对象由Java虚拟机抛出，或者可以由Java `throw`语句抛出。  类似地，只有这个类或其子类可以是`catch`子句中的参数类型。  对于异常，编译时检查的目的`Throwable`和任何子类`Throwable`  ，是不是也无论是子类[`RuntimeException`](../../java/lang/RuntimeException.html)或[`Error`](../../java/lang/Error.html)被视为检查的异常。 常用方法

常用方法

```java
String getMessage();//异常原因
String toString();//异常类型及原因
void printStackTrace();//异常类型、原因、位置
```

`void printStackTrace()` 打印的内容与JVM处理异常打印的内容相同，但JVM处理异常后的语句不再执行，该方法执行后，这个异常后的内容课正常执行；

## 3.Exception 类与RuntimeException 类的区别

1.Exception 类是RuntimeException 类的父类，使用Exception 定义的异常都要求必须使用异常处理，而RuntimeException 定义的异常可以由用户选择性的来进行异常处理

2.常见的RuntimeException ：ClassCastException(类型转换异常)  ,NullPointerException（空指针异常）