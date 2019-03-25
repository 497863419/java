class Person{
    public String info="爸爸！";
}
class Student extends Person{
    public String info="儿砸!";
    public void print(){
        System.out.println(super.info);//调用父类属性
        System.out.println(this.info);//调用本类属性
    }
}
public class Text4{
public static void main(String[] args){
    new Student().print();
}
}