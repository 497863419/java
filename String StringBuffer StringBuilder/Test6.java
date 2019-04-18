package Test;

public class Test6 {
    public static void main(String[] args) {
       /* //append()方法
        //String类与StringBuffer类的互相转化
        String str = "helloworld";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer();
        sb2.append("hello").append("world");
        System.out.println(sb2);*/


      /* //字符串反转
        StringBuffer sb1 = new StringBuffer("Helloworld");
        System.out.println(sb1.reverse());*/


    /*  //字符串的删除
        StringBuffer sb3 = new StringBuffer("helloworld");
        System.out.println(sb3.delete(2,5));
    }*/


        //字符串的插入操作
        StringBuffer sb4 = new StringBuffer("hello");
        System.out.println(sb4.insert(0, 123));
        System.out.println(sb4.insert(5, "world"));
    }
}
