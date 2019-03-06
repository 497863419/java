//数组扩大方法
//数组打印方法
//数组初始化方法
public class ArrayDemo{
	public static void main(String[] args){
		int[] data=Init();
		bigger(data);
		printArray(data);
		
	}
	public static int[] Init(){
		int[] data=new int[]{1,5,10,15,20,30};
		return(data);
	}
	public static int[] bigger(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]+=5;
		}
		return arr;
	}
	public static void printArray(int[] arr){
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+",");
		}
		System.out.println();
	}
}