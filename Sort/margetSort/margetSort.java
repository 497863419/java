package Ds.Sort.margetSort;

import java.util.Arrays;

/**
 * @Name： 归并排序
 * @Author：ZYJ
 * @Date：2019-08-20-16:20
 * @Description:
 */
public class margetSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,2,3,6,7,9,1,0};
        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        margetSort(arr,0 ,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    //分
    public static void margetSort(int[] arr ,int left ,int right ,int[] temp){
        if (left<right){
            int mid = (left+right)/2;
            margetSort(arr,left,mid,temp);//分左边
            margetSort(arr,mid+1,right,temp);//分右边
            //和并
            marge(arr,left,mid,right,temp);
        }
    }

    public static  void marge(int[] arr,int left,int mid ,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        while (i<=mid && j <= right){
            if (arr[i] <=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while (i<= mid){
            temp[t++] = arr[i++];
        }
        while (j<= right){
            temp[t++] = arr[j++];
        }

        //copy
        t=0;
        int tempLeft = left;
        while (tempLeft<=right){
            arr[tempLeft++] =temp[t++];
        }
    }
}
