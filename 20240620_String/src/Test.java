import java.util.Arrays;
import java.util.Locale;

/**
 * Description:
 * Date: 2024-06-20
 * Time: 9:20
 */
public class Test {

    //分割0
    public static void main(String[] args) {
        String str = "abc&def=h&ij";
        String [] strings = str.split("&|=");
        for (String s :strings){
            System.out.println(s);
        }
    }
    //数字转字符串
    public static void mai4n(String[] args) {
        String s1  =  String.valueOf(1234);
        String s2 = String.valueOf(12.34);
        String s3 = String.valueOf(true);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //大小写转换
        String str2 = "ABCD";
        String str3 = str2.toLowerCase();
        System.out.println(str3);


        String str4 = "abcd";
        String str5 = str4.toUpperCase();
        System.out.println(str5);


        //把字符串转换为数组
        char[]array = str4.toCharArray();
        System.out.println(Arrays.toString(array));
    }

    public static void main3(String[] args) {
        String str = "abcdef";
        String str2 = "ABCDEF";

        //获取下标对应字符
        char ch = str.charAt(1);
        System.out.println(ch);

        //获取字符对应的下标
        System.out.println(str.indexOf("bc"));


        //从后往前找
        String str3 ="abababadbcbd";
        System.out.println(str3.lastIndexOf('a'));
        //从指定开始从后往前找字符 a
        System.out.println(str3.lastIndexOf('a',4));

    }
    public static void main2(String[] args) {
        String str = "abcdef";
        String str2 = "abcdef";



        System.out.println(str.equals(str2));
        //比较地址
        System.out.println(str==str2);


        String str3 = new String("hello");
        String str4 = new String("Hello");

        System.out.println(str3.equals(str4));
        //忽略大小写
        System.out.println(str3.equalsIgnoreCase(str4));
    }




    public static void main1(String[] args) {

        String str = "abcdef";

        String str2 = new String("hello");

        char[] array = {'a','b','c','d'};
        String str3 = new String(array);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
    }
}