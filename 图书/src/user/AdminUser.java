package user;

import operation.*;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-06-19
 * Time: 21:37
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.ioPerations =new IOPeration[]{
                new ExitOperation(),
            new FindOperation(),
            new  AddOperation(),
                new DeleteOperation(),
                new ShowOperation()

        };
    }
    public int menu(){
        System.out.println("*****管理员用户菜单*****");
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
