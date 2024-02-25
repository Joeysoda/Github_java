import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-25
 * Time: 13:56
 */
public class prime_number {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i=2;
        for( ;i<=Math.sqrt(num);i++){
            if(num % i ==0){
                break;
            }
        }
        if(i>Math.sqrt(num)){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" not prime number");
        }



    }
}