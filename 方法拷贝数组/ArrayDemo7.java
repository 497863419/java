//数组拷贝方法
public class ArrayDemo7{
	public static void main(String[] args){
		int[] data1=new int[]{2,3,4,5,6,7,8,9};
		int[] data2=new int[]{33,44,55,66,77,88};
		System.arraycopy(data2,2,data1,3,3);
		printArray(data1);
	}  
	public static void printArray(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+",");
		}
		System.out.println();
	}
	
}