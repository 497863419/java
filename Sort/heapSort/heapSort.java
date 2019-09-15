package Ds.Sort.heapSort;

import java.util.Arrays;

/**
 * @Name：  堆排序
 * @Author：ZYJ
 * @Date：2019-08-22-15:10
 * @Description:
 */
public class heapSort {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,4,6,9,7,0,1};
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        for(int i =arr.length/2-1;i>=0;i--){//最后一个非叶子结点
            adjustDown(arr,i,arr.length);
        }
        for (int j=arr.length-1;j>0 ;j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j]= temp;
            adjustDown(arr,0,j);
        }
    }

    private static void adjustDown(int[] arr,int i ,int length){
        int child=0;
        int temp = 0;
        for(temp = arr[i] ;i*2+1<length;i=child){
            child = 2*i+1;
            if (child!=length-1 && arr[child]<arr[child+1]){
                child++;
            }
            if(temp<arr[child]){
                arr[i] = arr[child];
            }else break;
        }
        arr[i] = temp;
    }
}
