import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-11
 * Time: 17:43
 */
public class one_two_three321 {
    public static void main(String[] args) {
        System.out.println("Input a integer: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        inverse(count);
    }

    public static void inverse(int n){
        while(n>10){
        int a=n%10;
        n=n/10;
            System.out.print(a+",");
        }
        System.out.println(n);
    }
}