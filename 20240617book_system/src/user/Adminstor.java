package user;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:19
 */
public class Adminstor extends User {
    public Adminstor(String name) {
        super(name);
    }
    public  int menu(){
        System.out.println("*********管理员用户菜单*********");
        System.out.println("1.查找");
        System.out.println("2.新增");
        System.out.println("3.删除");
        System.out.println("4.显示");
        System.out.println("0.退出");
        System.out.println("====================");
        System.out.println("请输入操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
