package CodeTest.colaBottle;

import java.util.Scanner;

/**
 * @Name：汽水瓶问题
 * @Author：ZYJ
 * @Date：2019-05-27-20:18
 * @Description:
 * 三个空瓶换一个 满瓶
 *
 * 有n个空瓶  共可以得到几瓶汽水？
 *   设有n个空瓶
 *   汽水总数total： total=total+n/3;
 *   空瓶数：n/3(换的满瓶后喝光还是空瓶)+n%3(剩余的空瓶)
 *   当n>2 时  可以去换购
 *   当n=2 时  借一瓶  喝完把三个空瓶还给老板
 *
 */
public class coroletBottleQue {
    public static  int drink(int n){
        int total=0;
        while (n>2){
            total=total+n/3;

            n=n/3+n%3;
        }
        while (n==2){
            total=total+1;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        scanner.useDelimiter("\n");
        while (scanner.hasNextInt()){
            n=scanner.nextInt();
            System.out.println(drink(n));

        }

    }
}
