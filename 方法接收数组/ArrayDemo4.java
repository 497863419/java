public class ArrayDemo4{//方法接收数组
	public static void main(String[] args){
		int[] data=new int[]{1,2,3,4};
		printArray(data);
		}
	public static void printArray(int[] temp){
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]);
		}
	}
}