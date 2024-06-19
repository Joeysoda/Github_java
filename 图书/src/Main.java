import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * Description:
 * Date: 2024-06-19
 * Time: 21:25
 */
public class Main {
    public static User login(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();

        System.out.println("请输入你的身份:1.管理员   2.普通用户");
        int choice = scanner.nextInt();

        if(choice==1){
            AdminUser adminUser = new AdminUser(name);
            return adminUser;
        }
        else{
            NormalUser normalUser = new NormalUser(name);
            return normalUser;
        }
    }
    public static void main(String[] args) {
        //因为调用的菜单不一样
        //menu的行为不一样
    User user = login();
    int choice=user.menu();
    BookList bookList = new BookList();
    user.doIoperations(choice,bookList);
    }
}
