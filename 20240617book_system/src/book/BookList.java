package book;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:08
 */
public class BookList {
    private Book[] books;
    private  int usedSize;
    public BookList(){
        books[0] = new Book("三国演义","罗贯中",10,"小说");
        books[1] = new Book("西游记","吴承恩",12,"小说");
        books[2] = new Book("红楼梦","曹雪芹",11,"小说");
        this.usedSize=3;
    }
}
