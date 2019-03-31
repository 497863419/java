import java.util.Arrays;
public class TestDemo{
    public static void  bubbleSort(int[] array){//静态内部类（没有外部对象）不可以访问外部类非静态域性，但是可以拥有普通属性、 静态域
        int temp=0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
    public static void  main(String[] args){
        int[] array ={1,5,9,4,8,23};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}