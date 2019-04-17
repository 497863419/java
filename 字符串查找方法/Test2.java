package Test;

public class Test2 {
    public static void main(String[] args) {
        String str="hello";
        System.out.println(str.contains("e"));
        System.out.println(str.contains("w"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("w"));
        System.out.println(str.indexOf("o",2));
        System.out.println(str.lastIndexOf("h"));
        System.out.println(str.lastIndexOf("w"));
        System.out.println(str.lastIndexOf("e",4));
        String str1 ="helloworld";
        System.out.println(str1.startsWith("he"));
        System.out.println(str1.startsWith("kw"));
        System.out.println(str1.startsWith("lo",3));//从指定位置开始查找
        System.out.println(str1.endsWith("ld"));
        System.out.println(str1.endsWith("ft"));





    }
}
