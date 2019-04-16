public class Test36{
    public static void main(String[] args)throws Exception{
    
    //    byte[] data= new byte[]{'h','e','l','l','o'};
    //    String str = new String(data);//将字节数组转化为字符串
    //    String str1 = new String(data,2,2);//将字节数组指定内容转换为字符串
    //    System.out.println(str);
    //    System.out.println(str1);
      String str="你好啊";
      byte[] data = str.getBytes();//将字符串转换为字节数组
      for(byte b :data){
          System.out.println(b);
      } 
      byte[] data1 = str.getBytes("UTF-8");
      for(byte a:data){
          System.out.println(a);
      }

    }
}