package homework.library;

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
        System.arraycopy(books,0,tmp, 0,size);
        books = tmp;
    }

    public void print(){
        for (int i = 0; i <size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(books[i]);
            }

        }
    }
}
