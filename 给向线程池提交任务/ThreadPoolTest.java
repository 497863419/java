package ThreadPoolDemo;

import javax.security.auth.callback.Callback;
import java.util.concurrent.*;

/**
 * @Name： 创建线程池 并使用submit()向线程提交任务
 * @Author：ZYJ
 * @Date：2019-06-17-19:48
 * @Description:
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,
                5,2000, TimeUnit.MILLISECONDS,
                  new LinkedBlockingDeque<Runnable>());
        CallableThread callableThread = new CallableThread();
        for(int i=0;i<5;i++){
            //实例化 Future对象接收提交的返回值
            Future<String> future = threadPoolExecutor.submit(callableThread);
            try {
                //调用Future类的get方法得到返回值
                String str = future.get();
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    private static class get {
    }
}
//实现类实现CallableThread接口 覆写call类
class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+","+i);
        }
        return Thread.currentThread().getName()+"任务执行完毕！";
    }
}
