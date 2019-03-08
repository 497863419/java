//定义类
class Person{
	//定义属性
	private String name;
	private int age;
	//定义构造方法
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		this.print();
	}
	//定义普通方法
	public String getPersonInfo(){
		return"姓名："+name+"，年龄："+age;
	}
	public void print(){
		System.out.println("*************");
	}
}
//定义测试类
public class Test6{
	public static void main(String[] args){
		Person per = new Person("张三",20);
		System.out.println(per.getPersonInfo());
	}
}