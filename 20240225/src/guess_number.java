import java.util.Random;
import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-25
 * Time: 13:29
 */
public class guess_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //TODO:nextInt 里面不写任何数字的时候,产生的随机数是什么范围
        double randNum = random.nextInt(100);//[0~100)
        System.out.println("随机数是:"+randNum);
        while (true){
            System.out.println("输入你要猜的数字");
            int num = scan.nextInt();
            if(num < randNum){
                System.out.println("猜小了");
            }
            else if(num > randNum){
                System.out.println("猜大了");
            }
            else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
