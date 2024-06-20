/**
 * Description:
 * Date: 2024-06-20
 * Time: 9:20
 */
public class Test {


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