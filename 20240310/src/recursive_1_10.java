import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-10
 * Time: 22:54
 */
public class recursive_1_10 {
    public static int  one_to_ten(int n) {
        int sum = 0;
        if (n == 0) {
            return sum;

        }
        else {
            sum = one_to_ten(n - 1) + n;
        }
        return sum;
    }


        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int num1 = in.nextInt();
            int num = one_to_ten(num1);
            System.out.println(num);
        }
    }

