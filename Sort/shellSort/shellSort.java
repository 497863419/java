package Ds.Sort.shellSort;

import java.util.Arrays;

/**
 * @Name：希尔排序
 * @Author：ZYJ
 * @Date：2019-08-15-14:51
 * @Description:
 */
public class shellSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 0, 6, 3, 9, 4, 8, 1, 7};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //交换法
    public static void shellSort(int[] arr) {
        int tmp =0 ;
        for(int gap =arr.length/2;gap>0;gap/=2){
            for(int i = gap;i<arr.length;i++){
                for(int j = i-gap ;j>=0;j -=gap){
                    if(arr[j]>arr[j+gap]){
                        tmp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = tmp;
                    }
                }
            }
        }
    }

    //移动法
    public static  void shellSort2(int[] arr){
        for(int gap = arr.length/2;gap>0;gap/=2){
            for (int i=gap ;i< arr.length;i++){
                int j =i ;
                int temp = arr[i];
               if(arr[j] <arr[j-gap]){
                   while (j-gap>=0 && temp<arr[j-gap]){
                       arr[j] = arr[j-gap];
                       j=j-gap;
                   }
                   arr[i] = temp;
               }
            }
        }

    }

}
