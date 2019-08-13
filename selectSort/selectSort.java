package com.DS.sort.selectSort;

import java.util.Arrays;

/**
 * @Name： 选择排序实现
 * @Author：ZYJ
 * @Date：2019-08-13-15:57
 * @Description:
 */
public class selectSort {
    public static void main(String[] args) {

        int[] arr ={12,24,56,27,38,90,23};
        System.out.println("排序前："+ Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序后："+Arrays.toString(arr));

    }

    public static  void selectSort(int[] arr){

        for(int i =0 ;i<arr.length-1;i++){
            //找最小
            int minIndex =i;
            int min = arr[i];

            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min =arr[j];
                    minIndex = j;
                }

            }
            //找到最小后交换
            if(minIndex!=i){//若假定的最小值就是最小值  不用交换
                arr[minIndex] =arr[i];//将假定的最小值赋给最小值位置
                arr[i] = min;
            }


        }
    }
}
