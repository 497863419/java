import java.io.*;//引用库
public class BinarySearch{
	public static void main(String[] args) throws IOException
	{
		int[] arr=new int []{23,24,25,26,27,28,29};//数组必须有序
		System.out.print("请输入想要查找的数字：");
		String str;//声明str为String类型的变量
		BufferedReader buf;//声明buf是BufferedReader类的变量
		buf=new BufferedReader(new InputStreamReader(System.in));
		str=buf.readLine();
		int num=Integer.parseInt(str);//将接收到的字符串转化成数字；
		int left=0;
		int right=arr.length-1;//******这个不能写成：arr.length,会造成下标越界
		   	   while(left<=right){
				   //if(num < arr[left] || num > arr[right]){
				    //System.out.println("您要找的数字不再范围内");
					//break;
			       //}
			       int  mid=(left+right)/2;//在循环内部；否则无法计算
			       if(arr[mid]==num){
				   System.out.println("找到了！");
				   break;
			       }
			       if(num<arr[mid]){
				   right=mid-1;
			       }else{
			       left=mid+1;
			       }
		        }
		        if(left>right){//循环结束的条件有两个1）left<=right不成立若不成立在while体结束后left>right说明已查找完毕
					System.out.println("没有找到！");
				}
	}
	
}
