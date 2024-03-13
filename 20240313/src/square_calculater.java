import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-13
 * Time: 20:47
 */
public class square_calculater {
    public static void main(String[] args) {
        System.out.println("Input an integer: ");
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int result=0;
        for (int i = 0; i < n; i++) {
            result+=n;
        }
        System.out.println(result);
    }


}
