public class Test33 {
    public static void main(String[] args) {
        // String str1 ="java";
        // String str2 = new String("java");
        // System.out.println(str1==str2);

        // int a=10;
        // int b=10;
        // System.out.println(a==b);

        /*
         * String str1 = "Hello"; String str = new String("Hello");
         * System.out.println(str1.equals(str));
         */

        /*
         * String str1 = "Hello"; String str = new String("Hello");
         * System.out.println(str1.equals(str)); System.out.println(str.equals(str1));
         */

        /*
         * String str = null;//假设由用户输入 System.out.println(str.equals("Hello"));
         */

        /*
         * String str1 = "Hello"; String str2 = "Hello"; String str3 = "Hello";
         * System.out.println(str1==str2); System.out.println(str1==str3);
         * System.out.println(str2==str3);
         */

        String str1 = new String("hello").intern();// 入池操作
        String str2 = "hello";
        System.out.println(str1 == str2);// false
        

    }
}