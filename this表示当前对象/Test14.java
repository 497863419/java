class Person{
   /* private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        this.print();//调用普通方法
    }
    public String getPersonInfo(){
        return "姓名："+this.name+",年龄："+this.age;
    // */
    public void print(){
        System.out.println("[PRINT]方法："+this);
    }
}
public class Test14{
    public static void main(String[] args){
        Person p1=new Person();  
        System.out.println("[MAIN]方法："+p1);
        p1.print();
        System.out.println("------------------");
        Person p2=new Person();
        System.out.println("[MAIN]方法："+p2);
        p2.print();
    }
}