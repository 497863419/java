package com.DS.sort.heapSort;

import java.util.Arrays;

/**
 * @Name：  堆排序
 * @Author：ZYJ
 * @Date：2019-08-22-12:27
 * @Description:
 */
public class heapSort {
    public static void main(String[] args) {
        int[] arr = {4,6,8,5,9};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void heapSort(int[] arr){
        for(int i =arr.length/2-1;i>=0 ;i--){
            perDown(arr,i,arr.length);
        }
        for (int j =arr.length-1;j>0;j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            perDown(arr,0,j);
        }
    }
    private static void perDown(int[] arr ,int i ,int length){
        int temp =0;
        int child=0;
        for(temp = arr[i];2*i+1<length;i=child){
            child = 2*i+1;
            if (child !=length-1 && arr[child] <arr[child+1]){
                child++;
            }
            if(temp<arr[child]){
                arr[i] = arr[child];
            }else break;
        }
        arr[i] = temp;
    }

}
