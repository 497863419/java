//使用private封装属性
class Person{
	 private String name;//使用了private对属性进行了封装，要访问私有属性必须使用getter和setter方法
	 private int age;
	 public void setName(String n){//setter方法：主要用于进行属性内容的设置与修改
		name = n;
	 }
	 public String getName(){//getter方法：主要用于进行属性内容的取得
		 return name;
	 }
	 public void setAge(int i){
		 if(i>0&&i<=200){
			 age = i;
		 }else{
			 age = 0;
		 }
	 }
	 public int getAge(){
		 return age ;
	 }
	public void getPersonInfo(){
		System.out.println("姓名："+name+"年龄："+age);
	}
}	
public  class Test4{
	public static void main(String[] args){
		Person person=new Person();
		person.setName("张三");
		person.setAge(17);
		person.getPersonInfo();
	}
}