public class Test34{
    public static void main(String[] args){
        //将字符数组转换为字符串
        // char[] data = new char[]{'h','e','l','l','o'};
        // String str1 = new String(data);
        // String str2 = new String(data,2,2);
        // System.out.println(str1);
        // System.out.println(str2);

        //取得指定位置的字符
        //将字符串转为字符数组
        String str = "hello";
        char c = str.charAt(3);
        System.out.println(c);
        char[] data =str.toCharArray();
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+",");
        }
       
        


    }
}