package Ds.Sort.QuickSort;

import java.util.Arrays;

/**
 * @Name：快速排序实现
 * @Author：ZYJ
 * @Date：2019-08-12-16:53
 * @Description:
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {75,67,35,27,35,89,50,98,100};
        System.out.print("排序前：" + Arrays.toString(arr));
        quickSort(arr);
        System.out.println();
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        int low = 0;
        int height = arr.length - 1;
        quickSort(arr, low, height);
    }

    private static void quickSort(int[] arr, int low, int height) {
        //分区操作 返回分区边界索引
        //对左右分区进行快排
        if (low < height) {
            int index = partition(arr, low, height);
            quickSort(arr, low, index - 1);
            quickSort(arr, index + 1, height);
        }
    }

    private static int partition(int[] arr, int low, int height) {

        //指定左右指针
        int i = low;
        int j = height;


        //将第一个数作为基准数
        int x = arr[low];
        //使用循环实现分许操作
        while (i < j) {
            while (arr[j] > x && i < j) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }


            while (arr[i] <= x && i < j) {
                i++;

            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }

        //将基准数填入
        arr[i] = x;
        //返回基准值的位置索引
        return i;

    }
}
