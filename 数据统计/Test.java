import java.util.Arrays;
public class Test{
public static void main(String[] args){
	int[] arr=new int[]{1,4,3,4,55,77,6,9,8};
	int max=arr[0];
	int min=arr[0];
	int sum=arr[0];
	double ave=0;
	java.util.Arrays.sort(arr);
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		/*if(arr[i]>max){
			max=arr[i];
		}
		if(arr[i]<min){
			min=arr[i];
		}*/
	}
	max = arr[(arr.length)-1];
	min = arr[0];
	ave=(double)sum/arr.length;
	System.out.println("最大值是："+max);
	System.out.println("最小值是："+min);
	System.out.println("总和为："+sum);
	System.out.println("平均值是："+ave);
}	
}
