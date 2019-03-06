public class BubbleSort{
	public static void main(String[] args){
		int[] arr=new int[]{12,45,67,27,89,28,43};
	    for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			    if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
		        }
			}
		}		
		for(int j=0;j<arr.length;j++){
			System.out.print(arr[j]+",");
		}
		System.out.println();
	}
}