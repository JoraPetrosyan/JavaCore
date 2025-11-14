package homework.library.storage;

import homework.library.model.Author;

import java.io.Serializable;

public class AuthorStorage implements Serializable {

    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] tmp = new Author[size + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public Author getAuthorByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getPhoneNumber().equals(phoneNumber)) {
                return authors[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }
}

