
import java.util.Scanner;

/**
 * Description:
 * Date: 2024-02-25
 * Time: 20:07
 */
public class simulated_landing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 3;

        while (count!=0){
            System.out.println("输入你的密码");
            String password = in.nextLine();
            if(password.equals("hello")){
                System.out.println("登陆成功");
                break;
            }else{
                count--;
                System.out.println("你还有 "+count+"次机会");
            }
        }
    }

}
