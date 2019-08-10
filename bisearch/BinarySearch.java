package com.DS.search.bisearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Name：折半查找 递归法
 * @Author：ZYJ
 * @Date：2019-08-10-15:44
 * @Description:
 */
public class BinarySearch {
    public static void main(String[] args) throws IOException {
        int[] arr = {13,15,27,35,43,61,72};
        System.out.print("请输入要查找到的数：");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int value =Integer.parseInt(buf.readLine());
        int result = BinarySearch(arr,value);
        if(result==-1){
            System.out.println("该数字不存在！！！");
        }else {
            System.out.println(value+"的索引是："+result);
        }
    }

    public static int BinarySearch(int[] arr ,int value){
        int left = 0;
        int right = arr.length-1;
        return BinarySearch(arr,value,left,right);

    }




    public static int BinarySearch(int[] arr,int value,int left,int right){
        if(left<right){
            return -1;
        }
        int mid = (left+right)/2;
        if(value==arr[mid]){
            return mid;
        }else if(value<arr[mid]){
            return BinarySearch(arr,value,left,mid-1);
        }else {
            return BinarySearch(arr,value,left=mid+1,right);
        }

    }
}

