package homework.library;

import java.util.Objects;

public class Book {

    private String title;
    private String authorName;
    private double price;
    private int quantity;


    public Book(String authorName, String title, double price, int quantity) {
        this.authorName = authorName;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public Book() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price, quantity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
