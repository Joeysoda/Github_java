import user.Adminstor;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Description:程序入口函数
 * Date: 2024-06-17
 * Time: 23:03
 */
public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();

        System.out.println("请输入你的身份:1.管理员   2.普通用户");
        int choice = scanner.nextInt();
        if (choice==1){
            Adminstor adminstor= new Adminstor(name);
            return adminstor;
        }
        else{
            NormalUser normalUser = new NormalUser(name);
            return normalUser;
        }
    }
    public static void main(String[] args) {
        //User 有可能引用管理员用户,或者普通用户
        User user = login();
        user.menu();
    }
}
