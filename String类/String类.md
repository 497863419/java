# String类

## 1.实例化方式

1）直接赋值

```java
String str="java";//str 是一个对象，保存在堆内存中
```

2）通过构造方法赋值法

```java
String str = new String("java");
```

String 是一个类，可以使用这种方法进行赋值操作

 3）两者的 str 是否相等

```java
String str1="java";
String str = new String("java");
System.out.println(str1==str2);//false
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161144635.png)

## 2.字符串相等比较

###  2.1 “==”比较符

```java
int a = 10;
int b = 10;
System.out.println(a==b);//ture
```

== 比较的是两个操作数的值。对于基本数据类型而言比较的就是两个值的大小，对于引用数据类型而言，比较的是两者指向指向的内存地址是否相同

由此可以解释1.中两种 实例化方式不相等

两种方式内存图如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/2019041616121535.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p5ajQ5Nzg2MzQxOQ==,size_16,color_FFFFFF,t_70)

### 2.2 equals

 equals ( ) 方法，可以用比较字符串内容；

```java
       String str1 = "Hello";
       String str = new String("Hello"); 
       System.out.println(str1.equals(str));
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161250677.png)

### 2.3 字符串常量是String类的匿名的对象

1.使用  “ ” 定义的内容都是字符串常量，所有字符串常量都是String 类的匿名对象

```java
String str1 = "Hello";
String str = new String("Hello");
System.out.println(str1.equals(str));
System.out.println(str.equals(str1));
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161322566.png)

2.在进行接收用户输入数据的时候一定要考虑到用户没有输入的问题，若没有输入会出现

NullPointerException 问题

```java
String str = null;//假设由用户输入
System.out.println(str.equals("Hello"));
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161343141.png)

所以 ，在进行比较的时候，建议将字符串写在前面 如下：

```java
String str = null;
```

### 2.4 实例化的区别

#### 1.直接赋值法

```java
 String str1 = "Hello";
 String str2 = "Hello";
 String str3 = "Hello";
 System.out.println(str1==str2);
 System.out.println(str1==str3);
 System.out.println(str2==str3);
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161404700.png)

为什么结果相同？

#### 2.共享设计模式

String类的设计采用共享设计模式

**直接赋值法**内存情况如下

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161419427.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p5ajQ5Nzg2MzQxOQ==,size_16,color_FFFFFF,t_70)

在JVM（java虚拟机 ）底层实际上会自动维护一个对象池（字符串常量池），如果采用了**直接赋值** 的模式进行String类的对象实例化操作，那么该实例化对象（字符串内容）将自动保存到这个常量池里。如果下次继续使用直接赋值的模式声明String 类对象，首先在对象池中查看，此时常量池若中有指定内容，将直接引用。如若没有，则开辟新的字符串对象而后将其保存在对象池中以供下次使用。

#### 3.构造方法实例化

```java
String str = new String("Hello");//该字符串没有保存在对象池中
```

内存分析：

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161435326.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p5ajQ5Nzg2MzQxOQ==,size_16,color_FFFFFF,t_70)

> 字符串入池操作：public String intern（）；

```java
String str1 = new String ("hello").intern();//入池操作
String str2 = "hello";
System.out.println(str1==str2);//false
```

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190416161450126.png)

解释String类中两种对象实例化的区别

1.直接赋值：只会开辟一块堆内存空间，并且该字符串内容可以保存在字符串常量池中以供下次使用。

2.构造方法：会开辟两块内存空间，其中一块会成为垃圾内存，不会保存在常量池中，可以使用intern（）方法手工入池。



## 3.字符串不可变更

字符串一旦定义不可改变。所有的语言对于字符串的底层实现，都是字符数组。

```java
String str = "hello";
str = str + " world";
str+="!!!";
System.out.println(srt);//hello world!!!
```

这种类型的字符串变更是字符串对象引用的变更而非字符串常量。（变的是栈的指向）；

上述变更内存分析

![在这里插入图片描述](https://img-blog.csdnimg.cn/2019041616162927.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3p5ajQ5Nzg2MzQxOQ==,size_16,color_FFFFFF,t_70)

由图可以看出这种类型的字符串 变更会产生大量的垃圾空间。所有不建议使用

在使用字符串时有以下几个原则：

1.字符串尽量使用直接赋值；

2.字符串比较使用equals()方法；

3.字符串+的现象 不要出现太多次，多次使用会产生大量垃圾内存；

