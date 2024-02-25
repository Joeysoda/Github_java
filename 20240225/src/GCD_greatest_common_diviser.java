import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-25
 * Time: 15:12
 */
public class GCD_greatest_common_diviser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = scan.nextInt();
        System.out.println("Input second number");
        int num2 = scan.nextInt();


        while (num2!=0){
            int m = num1%num2;
            num1=num2;
            num2=m;
        }
        System.out.println("GCD="+num1);
    }
}
