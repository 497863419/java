public class ArrayUtils{
	public static void main(String[] args){
		int[] data=new int[]{56,34,73,96,88,24,28};
		int Max=arrayMaxElement(data);
		int Min=arrayMinElement(data);
		int Sum=arraySumElement(data);
		arraySub(data,3,5);
		printArray(data);
		printReversal(data);
		System.out.println("最大值为"+Max);
		System.out.println("最小值为"+Min);
		System.out.println("数字和为"+Sum);
	}
	//数组中最大元素；
	public static int arrayMaxElement(int[] data){
		int Max=data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]>Max){
				Max=data[i];
			}
		}
		return Max;
	}
	//数组中最小元素；
	public static int arrayMinElement(int[] data){
		int Min=data[0];
		for(int i=0;i<data.length;i++){
			if(data[i]<Min){
				Min=data[i];
			}
		}
		return Min;
	}
	//数组中元素之和；
	public static int arraySumElement(int[] data){
		int Sum=0;
		for(int i=0;i<data.length;i++){
			Sum+=data[i];
		}
		return Sum;
	}
	//数组拼接；
	public static void arraySub(int[] data,int start,int end){
		int[] arr={1,2,3,4};
		int j=0;
		int i=0;
		int[] narr=new int[arr.length+(end-start+1)];
		for(i=0;i<arr.length;i++){
			narr[j++]=arr[i];
		}
		for(i=start;i<=end;i++){
			narr[j++]=data[i];
		}
		System.out.print("拼接数组是：");
		for(i=0;i<narr.length;i++){
			System.out.print(narr[i]+",");
		}
	System.out.println();
	}
	//数组打印:4,3,2,1
	public static void printArray(int[] data){
		System.out.print("原数组为：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+",");
		}
		System.out.print("翻转打印为：");
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]+"," );
		}
		System.out.println();
	}
	//数组反转  [1,2,3,4]=[4,3,2,1]；
	public static void printReversal(int[] data){
		System.out.print("原数组为：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+",");
		}
		System.out.print("数组反转后为：");
		    int left=0;
			int right=data.length-1;
			int swap=0;
			for(int i=0;left<right;i++){
			swap=data[left];
			data[left]=data[right];
			data[right]=swap;
			left++;
			right--;
			}
		for(int i=0;i<data.length;i++){
		    System.out.print(data[i]+",");
        }
		    System.out.println();
		
	}
	  
		
	}
	

