import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 23:58
 */
public class recursive_fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int n=fib(num1);
        System.out.println(n);
    }
    public static int fib(int num1){
        if(num1==1||num1==2){
            return 1;
        }
        else{
            return fib(num1-1)+fib(num1-2);
        }
    }

}
