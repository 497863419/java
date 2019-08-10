package com.DS.search.bisearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Name：  折半查找
 * @Author：ZYJ
 * @Date：2019-08-10-11:38
 * @Description:
 */
public class biSearchTest {
    public static void main(String[] args) throws IOException {
        int[] arr ={3,7,8,12,14,16,19};
        System.out.print("请输入要查找的数字：");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(buf.readLine());
        int result = BinarySearch(arr,value);
        if (result==-1){
            System.out.println("没有找到该数！");
        }else {
            System.out.println(value+"的索引为："+result);
        }
    }

    public static int BinarySearch(int[] arr,int value){
        int left =0;
        int right = arr.length-1;
        while (left<=right){
            int mid = (left +right)/2;
            if(value==arr[mid]){
                return mid;
            }else if(value<arr[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
      return -1;
    }
}
