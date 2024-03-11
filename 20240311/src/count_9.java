import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-11
 * Time: 14:21
 */
public class count_9 {
    public static void main(String[] args) {
        System.out.println("Input a integer: ");
        Scanner in = new Scanner(System.in);
        int count=in.nextInt();
        int n=count9(count);
        System.out.println(n);
    }

    public static int count9(int n){
        int count=0;
        while(n>8) {
            if (n % 10==9 && n / 10 == 9) {
                count += 2;
                n--;
                continue;
            }

            else if(n % 10== 9 || n / 10==9) {
                count++;
                n--;
                continue;
            }
            else
                n--;
        }

return count;
    }
}
