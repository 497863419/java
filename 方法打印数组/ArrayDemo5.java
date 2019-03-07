public class ArrayDemo5{
	//实现Init（）初始化方法
	//实现printArray() 打印数组方法
	public static void main(String[] args){
		int[] arr=Init();
		printArray(arr);
	}
	public static int[] Init(){
		int[] arr=new int[]{1,2,3};
		return(arr);
	}
    public static void printArray(int[] data){
		for(int i=0;i<data.length;i++){
			System.out.print("data["+i+"]="+data[i]+",");
		}
	}
}