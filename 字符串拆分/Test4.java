package Test;

public class Test4 {
    public static void main(String[] args) {
        //全部拆分
        String str = "Hello world !!!";
        String[] result = str.split(" ");
        for (String s : result) {
            System.out.println(s);
        }

        //按照指定长度拆分
        String str1 = "hello world !!!";
        String[] result2 = str1.split(" ", 4);//拆成两个
        // 当limit<最大 按照limit  如果大于 按最大处理
        for (String r : result2) {
            System.out.println(r);
        }

        //拆分IP地址
        String str2 = "192.169.1.1";
        String[] result3 = str2.split("\\.");
        for (String r : result3) {
            System.out.println(r);
        }

        //多次拆分
        String str3="yuisama:27|yui:25";
        String[] result4 = str3.split("\\|");//先用|拆分  拆完放入result4中
        for(int i=0;i<result4.length;i++){
            String[] temp = result4[i].split(":");//用：拆result4 拆完放入temp中
            System.out.println(temp[0]+"="+temp[1]);
        }
    }
}
