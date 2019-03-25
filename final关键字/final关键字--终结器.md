# final关键字--终结器

使用场景：

**1.修饰类：使用final修饰类不能有子类（无法使用extends继承）；**

**2.修饰方法：使用final修饰的方法无法被覆写**

**3.修饰属性：final修饰的属性必须在声明时赋值，并且该属性无法被修改;**

基本数据类型：值不能变        引用数据类型:地址不能变

**· final成员变量必须在声明时赋值或者在构造器（构造方法）中初始化，否则编译报错；**

```java
public final int a =100;
```

**·使用final修饰的变量不能再次赋值**

**·定义常量使用 （Public static final），常量命名全用大写，多个单词间以_分隔**

```java
public static final MAX_AGE = 120;
```

## 数据类型转换

当是使用+、-、*、/、% 运算操作符时，遵循以下规则：

**1.只要两个操作数中有一个是double类型，另一个将会被转换成double类型，并且计算结果也为double型。**

**2.如果两个操作数中有一个是float类型，另一个将会被转换成float类型，并且计算结果也为float型。**

**3.如果两个操作数中有一个是long类型，另一个将会被转化成long类型，并且结果也为long型。**

**4.否则操作数为（int、short、byte、char）两个数都会被转换成int类型，并且结果也为int类型，但final修饰的域类型不会发生变化。**

```
//面试题
byte b1=1,b2=2,b3,b6,b8;
final byte b4=4,b5=6,b7=9;
public void test(){
    b3=(b1+b2);//false
    b6=b4+b5;//ture
    b8=(b1+b4);//false
    b7=(b2+b5);//false
    System.out.println(b3+b6);
}
```

