package user;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:19
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
    }
    public  int menu(){
        System.out.println("*********普通用户菜单*********");
        System.out.println("1.查找");
        System.out.println("2.借阅");
        System.out.println("3.归还");
        System.out.println("0.退出");
        System.out.println("====================");
        System.out.println("请输入操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
