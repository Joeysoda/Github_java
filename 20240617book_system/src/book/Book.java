package book;

/**
 * Description:
 * Date: 2024-06-17
 * Time: 23:05
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isLead;

    public Book(String name, String author, int price, String type, boolean isLead) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isLead = isLead;
    }
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isLead=" + isLead +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLead() {
        return isLead;
    }

    public void setLead(boolean lead) {
        isLead = lead;
    }
}
