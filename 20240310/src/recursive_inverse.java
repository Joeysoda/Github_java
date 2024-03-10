import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 23:06
 */
public class recursive_inverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        inverse(num1);

    }
    public static void inverse(int num) {
        if (num > 9) {
            inverse(num / 10);
        }
        System.out.println(num % 10);
    }
}
