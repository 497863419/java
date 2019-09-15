package Ds.Sort.selectSort;

import java.util.Arrays;

/**
 * @Name： 选择排序
 * @Author：ZYJ
 * @Date：2019-08-13-16:09
 * @Description:
 */
public class selectSort {
    public static void main(String[] args) {
        int arr[] = new int[50];
        //获取随机数
        for(int i =0 ;i<50;i++){
            arr[i] = (int)(Math.random()*50);
        }
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));

        selectSort(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));

    }

    public static void selectSort(int[] arr){

        for(int i =0 ;i<arr.length;i++){
            int minIndex = i;
            int min = arr[i];

            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<min){//  3ey升序降序只改这里
                    min =arr[j];
                    minIndex = j;
                }
            }

            if(minIndex!=i){
                arr[minIndex] =arr[i];
                arr[i] = min;
            }

        }
    }
}
