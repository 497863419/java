package Test.StackTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Name：  借助栈实现进制转换
 * @Author：ZYJ
 * @Date：2019-07-27-15:08
 * @Description:
 */
public class TestConvert {
    public static void main(String[] args) {
        int num =4567;
        Deque stack = new LinkedList();
        while (num>0){
            stack.push(num%2);
            num=num/2;
        }
        System.out.print(num+"--->");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
