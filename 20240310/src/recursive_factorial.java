import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 22:41
 */
public class recursive_factorial {
        public static double factorial(double n){
            if(n==1){
                return 1;
            }return factorial(n-1)*n;

        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1 =in.nextDouble();
        double num =factorial(num1);
        System.out.println(num);
    }
}
