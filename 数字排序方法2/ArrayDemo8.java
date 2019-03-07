import java.util.Arrays;
public class ArrayDemo8{
	public static void main(String[] args){
		int[] original=new int[]{1,2,3,4,5,6,7,8,9};
		int[] result=Arrays.copyOf(original,17);
		for(int temp:result){
			System.out.print(temp);
		}
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+",");
		}
		System.out.println();
	}
}