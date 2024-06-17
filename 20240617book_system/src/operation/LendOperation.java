package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:57
 */
public class LendOperation implements  IOPeration{
    @Override
    public void work (BookList bookList){
        System.out.println("借阅");
    }
}
