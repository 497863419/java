package MapTest;

/**
 * @Name： 自定义类做为键值
 * @Author：ZYJ
 * @Date：2019-07-20-09:58
 * @Description:
 */

import java.util.*;

/**
 * 自定义Person类并设置属性
 * 为保证Key唯一，在Person类中覆写 HashCode()和 equals()方法
 */
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //覆写hashCode()和equals()以保证key唯一

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}


public class PersonKey {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Amanda", 21), "程序员");
        map.put(new Person("Dabe", 20), "研究僧");
        map.put(new Person("Spring", 23), "老师");
        map.put(new Person("Amanda", 21), "攻城狮");

        //遍历map集合
        /**
         * 使用Entry对象遍历
         */
        //1，使用entrySet()将Map集合转为Set集合
        Set<Map.Entry<Person, String>> set = map.entrySet();
        //2，获取迭代器
        Iterator<Map.Entry<Person, String>> iterator = set.iterator();
        //3，取出每一个key和value
        while (iterator.hasNext()) {
            Map.Entry<Person, String> entry = iterator.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);

        }

        /**
         * 使用增强for循环遍历
         */
        for(Map.Entry<Person,String> entry :set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);

        }
    }
}
