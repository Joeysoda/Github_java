import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-27
 * Time: 16:07
 */
public class plus {
    public static int plus1(int a){
        if (a==1){
            return 1;
        }
        return plus1(a-1)+a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();

        int ret = plus1(num);
        System.out.println(ret);
    }
}
