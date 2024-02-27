import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-27
 * Time: 16:16
 */
public class sum_of_digit {
    public static int sum(int a){
        if(a<10){
            return a;
        }
        return a%10+sum(a/10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        int ret = sum(num);
        System.out.println(ret);
    }
}
