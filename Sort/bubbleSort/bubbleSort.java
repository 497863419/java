package Ds.Sort.bubbleSort;

import java.util.Date;

/**
 * @Name：  冒泡排序
 * @Author：ZYJ
 * @Date：2019-09-15-15:47
 * @Description:
 */
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = new int[80];
        //获取随机数
        for(int i =0 ;i<80;i++){
            arr[i] = (int)(Math.random()*50);
        }

        Date date = new Date();
        System.out.println(date);
        bubbleSort(arr);
        System.out.println(date);



    }
    public static int[] bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
            /*System.out.println("第"+ i +"趟");
            System.out.println(Arrays.toString(arr));*/
        }
        return arr;
    }
}
