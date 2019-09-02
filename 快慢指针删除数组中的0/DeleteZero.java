import java.util.Arrays;

/**
 * @Name： 快慢指针删除数组中为0的数据
 * @Author：ZYJ
 * @Date：2019-09-02-20:03
 * @Description:
 */
public class DeleteZero {
    public static void main(String[] args) {
        int[] arr={0,2,0,5,7,0,3,6};
        System.out.println(Arrays.toString(arr));
        int low=0;
        int fast=low+1;
        while (fast<arr.length){
            //慢指针先走，慢指针找0
            while (low<arr.length && arr[low]!=0){
                low++;
            }
            if (low==arr.length) {
                break;
            }
            //快指针后走，后指针找为0
            while (fast<arr.length && arr[fast]==0){
                fast++;
            }
            //找到后交换
            if (fast<arr.length){
                arr[low]=arr[fast];
                arr[fast] =0 ;
            }
        }
        int i;
        for(i=0;i<low;i++){
            System.out.print(arr[i]);
        }
    }
}
