package homework.library.model;

import homework.library.util.DateUtil;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Book implements Serializable {

    private String title;
    private Author author;
    private double price;
    private int quantity;
    private Date createdDate;

    public Book(String title, Author author, double price, int quantity, Date createdDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.createdDate = createdDate;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(createdDate, book.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, quantity, createdDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                ", createdDate=" + DateUtil.fromDateToStr(createdDate) +
                '}';
    }
}