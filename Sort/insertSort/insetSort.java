package Ds.Sort.insertSort;

import java.util.Arrays;

/**
 * @Name：  插入排序
 * @Author：ZYJ
 * @Date：2019-08-13-21:15
 * @Description:
 */
public class insetSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){
         int insertVal=0;
         int insertIndex=0;
        for(int i =1;i<arr.length;i++){
            insertVal = arr[i];
            insertIndex = i-1;
            while (insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex+1!=i)
            arr[insertIndex+1] = insertVal;
        }
    }
}
