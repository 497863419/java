package Test.annotation;

/**
 * @Name： 具体操作类
 * @Author：ZYJ
 * @Date：2019-08-24-15:19
 * @Description:
 */


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *加入注解
 */
@Pro(className = "Test.annotation.Demo1",methodName = "show1")
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        //1.获取类对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.使用类对象获取注解对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.使用注解对象获取类名、方法名
        String className = an.className();
        String methodName = an.methodName();

        //4.加载类进内存
        Class<?> cls = Class.forName(className);
        //5.创建对象
        Object obj = cls.newInstance();
        //6.获取方法对象
        Method method = cls.getMethod(methodName);
        //7.执行方法
        method.invoke(obj);
    }
}
