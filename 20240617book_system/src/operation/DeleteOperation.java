package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:52
 */
public class DeleteOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除");
    }
}
