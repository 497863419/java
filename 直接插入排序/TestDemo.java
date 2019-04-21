package Test;

import java.util.Random;

//直接插入排序
public class TestDemo {
    public static void insertSort(int[] array) {
        long start = System.currentTimeMillis();
        int tmp = 0;
        int j;
        for (int i = 1; i < array.length; i++) {

            tmp = array[i];
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    //array[j+1]=tmp;
                    break;
                }
            }
            array[j + 1] = tmp;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            // array[i] = random.nextInt(10000)+1;
            array[i] = i + 1;
        }
    }
}
