package Test;

import java.util.Arrays;

public class shellSort {
    public static void shell(int[] array,int gap){
        int i=0;
        int j;
        int tmp=0;
        for(i=gap;i<array.length;i++){
            tmp=array[i];
            for(j=i-gap;j>=0;j=j-gap){
               if(array[j]>tmp){
                   array[j+gap]=array[j];
               }else{
                   break;
               }
            }
            array[j+gap]=tmp;
        }
    }
    public static void shellSort(int[] array){
        int[] drr={5,3,1};
        for(int i=0;i<drr.length;i++){
            shell(array,drr[i]);
        }
    }
    public static void main(String[] args) {


        int[] array = {12,5,9,34,6,8,33,56,89,0,7,4,
                22,55,77};
        shellSort(array);
        System.out.println(Arrays.toString(array));

    }

}
