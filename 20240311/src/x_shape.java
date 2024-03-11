import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-11
 * Time: 15:13
 */
public class x_shape {
    public static void main(String[] args) {
        System.out.println("Input a integer: ");
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        xshape(count);

    }
    public static void xshape(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j||n==i+j+1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
