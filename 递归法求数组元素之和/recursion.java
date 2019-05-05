package Ds.recursion;

/**
 * @Name：递归法求一个数组的元素
 * @Author：ZYJ
 * @Date：2019-05-05-20:39
 * @Description:
 */
public class recursion {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,4};
        System.out.println(sum(array));
    }
    public static int sum(int[] array){
        return sum(0,array);
    }
    public static int sum(int l,int[] array){
        if(l==array.length){
            return 0;
        }else{
            return array[l]+sum(l+1,array);
        }
    }
}
