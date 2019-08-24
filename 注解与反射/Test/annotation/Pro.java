package Test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Name：  自定义注解类
 * @Author：ZYJ
 * @Date：2019-08-24-15:14
 * @Description:
 */

@Target({ElementType.TYPE})//定义该注解可使用的位置
@Retention(RetentionPolicy.RUNTIME)//定义该注解可以保留的阶段
public @interface Pro {
    String className();
    String methodName();
}
