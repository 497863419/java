public class Test37{
    public static void main(String[] args){
        String str = "";
        String str1="hello";
        System.out.println(UpFirst(str));
        System.out.println(UpFirst(str1));
    } 
    public static String UpFirst(String str){
        if(str.isEmpty()){
            System.out.println("这个字符串是空的！！！");
            return str;
        }else{
            return str.substring(0,1).toUpperCase()+str.substring(1);            
        }
    }  
}