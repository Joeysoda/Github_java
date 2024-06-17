package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:46
 */
public class FindOperation implements IOPeration {
    @Override
    public void work (BookList bookList){
        System.out.println("查找图书");

    }
}
