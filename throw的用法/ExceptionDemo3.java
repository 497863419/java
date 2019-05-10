package www;

/**
 * @Name：throw 关键字使用
 * @Author：ZYJ
 * @Date：2019-05-09-21:00
 * @Description:
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            throw new Exception("抛个异常玩~~~~");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
