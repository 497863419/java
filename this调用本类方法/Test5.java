class Person{//定义类
	//定义属性
	private String name;
	private int age;
	//定义构造方法
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	//定义普通方法
	public String getpersonInfo(){
		return "姓名："+name+",年龄："+age;
	}
}
//定义测试类
public class Test5{
	public static void main(String[] args){
	Person per = new Person("张三",20);
    System.out.println(per.getpersonInfo());	
	}
}
//当参数与类中属性同名时，类中属性无法被正确赋值。运行结果为 姓名：null，年龄：0
//加上this时运行结果为： 姓名：张三，年龄：20；