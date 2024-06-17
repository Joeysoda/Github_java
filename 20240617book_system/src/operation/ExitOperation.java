package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:56
 */
public class ExitOperation implements IOPeration{
    @Override
    public void work (BookList bookList){
        System.out.println("退出");
    }
}
