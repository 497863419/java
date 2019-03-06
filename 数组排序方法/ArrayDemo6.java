//数组排序
public class ArrayDemo6{
	//分别定一个int型数组和一个char型数组
	//分别调用排序方法给两个数组排序；
	//分别打印两个数组
	public static void main(String[] args){
		int[] intdata=new int[]{25,37,43,78,62,59};
		char[] chardata=new char[]{'r','y','g','e','o'};
		java.util.Arrays.sort(intdata);
		java.util.Arrays.sort(chardata);
		printArray(intdata);
		printArray(chardata);
	}
	public static void printArray(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+",");
		}
		System.out.println();
	}
	public static void printArray(char[] temp){
		for(int j=0;j<temp.length;j++){
			System.out.print(temp[j]+",");
		}
	}
}