class Person{
    private  String name;
    private   int age;
    public Person(){
        System.out.println("*******1.产生一个新的Person对象********");
    }
    public Person(String name){
        //System.out.println("*******2.产生一个新的Person对象********");
        this();//调用本类无参构造
        this.name=name;

    }
    public Person(String name,int age){
/*this调用普通方法： this.方法名称
  this调用构造方法： this（参数）

 */

        //System.out.println("*******3.产生一个新的Person对象********");
        this(name);
        //调用本类有参构造//this调用构造方法的语句必须在构造方法首行
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
