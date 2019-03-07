public class ArrayDemo3{
	public static void main(String[] args){
		int[][]arr=new int[][]{{1,2,3},{4,5,6,7},{8,9,0}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){//二维数组的二重长度与在某一行有关
			//System.out.print(arr[i][j]+",");
			System.out.print("data["+i+"]["+j+"]="+arr[i][j]+",");
			 }
			 System.out.println();
			 
		}
	}
}