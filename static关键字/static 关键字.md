# static 关键字

**static 属性又称类属性，保存在全局数据区大的内存之中，所有对象都可以进行该数据区的访问。**

修饰属性：静态属性（类属性） 访问方式：类名.属性名、this.属性名（不建议）

修饰方法：静态方法（类方法）  访问方式：类名、方法名

静态方法中不能访问非静态属性（变量）和方法

静态属性，方法如果在同一类中访问，可以省去类名。

```java
class Person{
	private static String country="中国";//private 封装 使用后不可修改属性
	private String name;
	private int age;
	
	public Person(String name,int age){//构造方法:作用为类中的属性进行初始化操作，避免多次使用setter方法
	   this.name=name;
	   this.age=age;
	}
	public static void setcountry(String c){//静态方法  所有static方法不允许调用非static定义的属性和方法
	//使用static定义方法的目的：某些方法不希望受到对象的控制，既可以在没有实例化对象的时候执行//
		country = c;
	}
	public void getPersonInfo(){
		System.out.println("姓名:"+this.name+",年龄："+this.age+",国家："+this.country);
	}
}
public class Test10{
public static void main(String[] args){
Person.setcountry("China");
Person person = new Person("Amanda",20);
person.getPersonInfo();
}	
}
```

**·** 所有static方法不允许调用非static定义的属性

**·** 所有的非static 方法允许访问 static方法或属性



