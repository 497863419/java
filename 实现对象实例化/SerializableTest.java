import java.io.*;

/**
 * @Name：实现对象序列化
 * @Author：ZYJ
 * @Date：2019-05-27-17:24
 * @Description: 将程序内容序列化后存入文件
 */
public class SerializableTest {
    public static final File FILE = new File("C:\\Users\\ZYJ\\Desktop" +
            "\\javaIO\\ioTest\\java.txt");

    public static void main(String[] args) throws IOException {
        ser(new Person("Amanda",21));
    }
    public static void ser(Object obj) throws IOException {
        //实例化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
        //将二进制流写入文件
        oos.writeObject(obj);
        //关闭流
        oos.close();
    }

}
class Person implements Serializable{
    private String name;
    private int age;

    Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Person [name="+name+",age="+age+"]";
    }

}
