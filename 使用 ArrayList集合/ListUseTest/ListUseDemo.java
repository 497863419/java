package ListUseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Name： 想集合中保存自定义类
 * @Author：ZYJ
 * @Date：2019-06-18-20:57
 * @Description:
 */
class Person{
    private String name;
    private int age;


    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 覆写 equals()
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person person = (Person) obj;
        return Objects.equals(name,person.name)&& Objects.equals(age,person.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ListUseDemo {
    public static void main(String[] args) {
        //将具体的类传入
        List<Person>  personList = new ArrayList<>();
        personList.add(new Person("张三",19));
        personList.add(new Person("李四",23));
        personList.add(new Person("王五",27));
        //remove()、contains()需要equals()支持
        personList.remove(new Person("李四",23));
        System.out.println(personList.contains(new Person("王五",13)));
        for(Person p :personList){
            System.out.println(p);
        }


    }

}
