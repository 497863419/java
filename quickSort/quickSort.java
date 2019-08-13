package com.DS.sort.quickSort;

import java.util.Arrays;

/**
 * @Name：  快速排序实现
 * @Author：ZYJ
 * @Date：2019-08-13-14:16
 * @Description:
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr ={12,3,45,68,2,7,6,32,44};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
    }
    private static  void quickSort(int[] arr ,int low,int high){
        if(low<high){
            int index = partition(arr,low, high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }
    private static int partition(int[] arr ,int low,int high){
        int i =low;
        int j =high;
        int x= arr[low];
        while (i<j){
            while (arr[j]>=x && i<j){
                j--;
            }
            if(i<j){
                arr[i] =arr[j];
                i++;
            }

            while (arr[i] <x && i<j){
                i++;
            }
            if(i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        arr[i] =x;
        return i;
    }
}
