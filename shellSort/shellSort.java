package com.DS.sort.shellSort;

import java.util.Arrays;

/**
 * @Name： 希尔排序
 * @Author：ZYJ
 * @Date：2019-08-15-14:38
 * @Description:
 */
public class shellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        System.out.println(Arrays.toString(arr));
<<<<<<< HEAD
      //  shellSort(arr);
       // System.out.println("=====================");
        shellSort2(arr);
=======
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
>>>>>>> 96c873c52f32d6075773379a63a0a95556af581c
    }

    public static void shellSort(int[] arr) {
        int temp =0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]){
                        temp =arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }

                }
            }
<<<<<<< HEAD
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void shellSort2(int[] arr){
        for(int gap = arr.length/2;gap>0;gap/=2){
            for(int i  = gap ; i<arr.length;i++){
                int j =i ;
                int temp =arr[j];
                if(arr[j] <arr[j-gap]){
                    while (j-gap>=0 && temp<arr[j-gap]) {
                        arr[j] = arr[j - gap];
                        j = j - gap;
                    }
                }
                arr[j] =temp;

            }
            System.out.println(Arrays.toString(arr));
=======
>>>>>>> 96c873c52f32d6075773379a63a0a95556af581c
        }
    }


}
