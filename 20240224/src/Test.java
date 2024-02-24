import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-24
 * Time: 13:48
 */

//continue
//public class Test {
//    public static void main(String[] args) {
//        int j= 1;
//        while(j<=5){
//            if(j==2){
//                continue;
//            }
//            System.out.println("j="+j);
//            j++;
//        }
//
//    }
//}死循环
//continue结束本次循环
//找到1~100之间的能被3整除也能被5整除的所有数字
//使用continue或者break
public class Test {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){

                if(i%15!=0) {
                    i++;

                    continue;
                }
            System.out.println(i);
            i++;

        }
        //输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名: ");
        String name = scan.nextLine();
        //nextLine 读取一行,可能有空格
        //next是遇到空格结束,不读取空格
        System.out.println(name);
        System.out.println("请输入年龄: ");
        int age = scan.nextInt();
        System.out.println(age);
        scan.close();
    }


}



