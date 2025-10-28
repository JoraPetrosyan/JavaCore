package employee.storage;

import homework.library.model.Author;
import homework.library.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBookByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                System.out.println(books[i]);
            }
        }
    }

    public void lookForTheBook(double min, double max) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("mijakayqgum gtnvox gnain grqer chkan");
        }
    }

    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deleteByIndex(int index) {
        for (int i = 0; i < size - 1; i++) {
            books[index] = books[size - 1];
        }
        size--;
    }
}