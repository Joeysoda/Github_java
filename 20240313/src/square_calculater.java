import java.util.Scanner;

/**
 * Description:
 * Date: 2024-03-13
 * Time: 20:47
 */
public class square_calculater {
    public static void main(String[] args) {
        System.out.println("Input an integer M: ");
        Scanner in = new Scanner(System.in);
        int M =in.nextInt();
        System.out.println("Input an integer N: ");

        int N =in.nextInt();
        double sum=0;
        //sum=Math.pow(2,32);
        sum=(M+N)*(M+N)*(M+N);//1.859080704E9(2*N)*(2*N)*(2*N);// 1.25566976E8
        System.out.println("The answer is "+sum);

    }


}
