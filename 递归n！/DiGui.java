public class DiGui{
	public static void main(String[] args){
		int n=10;
		int result=mul(n);
		System.out.println(result);
	}
	public static int mul(int n){
		if(n==1){
			return 1;
		}
		else {
			return n*mul(n-1);
		}
	}
}