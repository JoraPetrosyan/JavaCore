package homework.library.demo;

import homework.library.Commands;
import homework.library.model.Author;
import homework.library.model.Book;
import homework.library.storage.AuthorStorage;
import homework.library.storage.BookStorage;
import homework.library.util.FileUtil;

import java.util.Date;
import java.util.Scanner;

public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = FileUtil.deserializeBookStorage();
    private static AuthorStorage authorStorage = FileUtil.deserializeAuthorStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printAuthorAndBookCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    FileUtil.serializeAuthorData(authorStorage);
                    break;
                case ADD_BOOK:
                    addBook();
                    FileUtil.serializeBookData(bookStorage);
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                    System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case IN_PROVIDED_INTERVAL:
                    getForProvidedInterval();
                    break;
                case DELETE_BY_INDEX:
                    deleteByIndex();
                    break;
            }
        }
    }

    private static void searchBookByAuthor() {
        System.out.println("Pleas choose Author by phone number");
        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            bookStorage.searchBookByAuthor(author);
        } else {
            System.out.println("Wrong author's phone number, please try again!!!");
        }
    }

    private static void addAuthor() {
        System.out.println("Pleas input author's name");
        String name = scanner.nextLine();
        System.out.println("Pleas input author's surname");
        String surname = scanner.nextLine();
        System.out.println("Pleas input author's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Pleas input author's phone number");
        String phoneNumber = scanner.nextLine();
        Author author = new Author(name, surname, age, phoneNumber);
        authorStorage.add(author);
        System.out.println("Author added successfully");
    }

    private static void addBook() {
        System.out.println("Pleas  choose Author by phone number");
        authorStorage.print();
        String phoneNumber = scanner.nextLine();
        Author author = authorStorage.getAuthorByPhoneNumber(phoneNumber);
        if (author != null) {
            System.out.println("Pleas input book's title");
            String bookTitle = scanner.nextLine();
            System.out.println("Pleas input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            Book book = new Book();
            book.setTitle(bookTitle);
            book.setPrice(price);
            book.setAuthor(author);
            book.setCreatedDate(new Date());
            bookStorage.add(book);
            System.out.println("Book added successfully");
        } else {
            System.out.println("Wrong author's phone number, please try again!!!");
        }
    }

    public static void getForProvidedInterval() {
        System.out.println("Pleas input interval start");
        int start = scanner.nextInt();
        System.out.println("Pleas input interval end");
        int end = scanner.nextInt();
        bookStorage.lookForTheBook(start, end);
    }

    public static void deleteByIndex() {
        System.out.println("Pleas input index for delete book");
        bookStorage.deleteByIndex(scanner.nextInt());
    }
}