public class Swap{
public static void main(String[] args){
int[] data={1,2,3,4,5,6};
 printReversal(data);
}
public static void printReversal(int[] data){
		System.out.print("原数组为：");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+",");
		}
		System.out.print("数组反转后为：");
		    int left=0;
			int right=(data.length)-1;
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