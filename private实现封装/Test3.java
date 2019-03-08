//无封装程序
class Person{
	 String name;
	 int age;
	 public void getPersonInfo(){
		 System.out.println("姓名："+name+",年龄："+age);
	 }
}	
public class Test3{
	public static void main(String[] args){
		Person person=new Person();
		person.name="张三";
		person.age=18;
		person.getPersonInfo();
	}
}