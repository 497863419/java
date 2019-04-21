package Test;

//直接插入排序  是
public class TestDemo {
    public static void insertSort(int[] array) {

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

    }

    public static void main(String[] args) {
        int[] array = new int[]{11, 3, 5, 8, 2, 7};
        insertSort(array);

    }
}
