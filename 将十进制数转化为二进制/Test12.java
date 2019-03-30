public class Test12{//将十进制数转为2进制；
    public static void main(String[] args){
        int x=32;
        int a[] = new int[8];
        for(int i=0;i<8;i++){
            a[i]=x%2;
            x/=2;
        }
        for(int i=a.length-1;i>=0;i--){
           System.out.print(a[i]+" ");
        }   
     }
}