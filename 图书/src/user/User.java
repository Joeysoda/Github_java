package user;

import book.BookList;
import operation.IOPeration;

/**
 * Description:
 * Date: 2024-06-19
 * Time: 21:26
 */
public abstract class User {
    protected String name;

    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doIoperations(int choice, BookList bookList){
        this.ioPerations[choice].work(bookList);
    }


}
