package www;

/**
 * @Name：  抛出异常  throws用在方法上
 * @Author：ZYJ
 * @Date：2019-05-09-20:46
 * @Description:
 */
public class ExceptionDemo {
    public static void main(String[] args) {
       try{
           System.out.println(calculate(10,0));
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    public static int  calculate(int x,int y)  throws Exception{
        return x/y;
    }
}
