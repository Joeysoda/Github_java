package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:58
 */
public class ReturnOperation implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("归还");
    }
}
