import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 23:47
 */
public class recursive_sum_of_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int n=sum(num1);
        System.out.println(n);
    }
        public static int sum(int n){
            if(n<10){
                return n;
            }

                return n%10+sum(n/10);


        }

}
