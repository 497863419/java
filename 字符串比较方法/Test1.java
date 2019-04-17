package Test;
//字符串比较大小

public class Test1 {
    public static void main(String[] args) {
        String str="hello";
        String str1="Hello";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));


       // System.out.println(str.compareTo(str1));
        System.out.println("A".compareTo("a"));
        System.out.println("a".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("AB".compareTo("AC"));
        System.out.println("赵".compareTo("钱"));
    }
}
