package operation;

import book.BookList;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:47
 */
public class AddOperation implements  IOPeration {
    @Override
    public void work (BookList bookList){
        System.out.println("新增图书");

    }
}
