import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-25
 * Time: 14:26
 */
public class prime_1TO100 {
    public static void main(String[] args) {
        for(int i=3;i<=100;i++)//
        {
            int num=2;
            for(;num<Math.sqrt(i);num++){
                if(i%num==0){
                    break;
                }

            }
            if(num>Math.sqrt(i)){
                System.out.println(i+ " is Prime number");
            }

//            else{
//                System.out.println(i+ " not a Prime number");
            //}
        }
    }
}
