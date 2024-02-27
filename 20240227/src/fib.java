import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-27
 * Time: 16:24
 */
public class fib {
    public static int fib_func(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib_func(n-1)+fib_func(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();

        int ret= fib_func(num);
        System.out.println(ret);
    }
}
