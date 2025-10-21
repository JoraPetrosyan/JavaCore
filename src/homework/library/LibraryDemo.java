package homework.library;

import java.util.Scanner;

public class LibraryDemo {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BookStorage bookStorage = new BookStorage();
    private static final String EXIT = "0";
    private static final String ADD_BOOK = "1";
    private static final String PRINT_ALL_BOOKS = "2";
    private static final String SEARCH_BOOK_BY_TITLE = "3";
    private static final String PRINT_EXPENSIVE_BOOK = "4";
    private static final String IN_PROVIDED_INTERVAL = "5";
    private static final String DELETE_BY_INDEX = "6";

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
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

    private static void addBook() {
        System.out.println("Pleas input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Pleas input book's authorName");
        String authorName = scanner.nextLine();
        System.out.println("Pleas input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Pleas input book's count");
        String s = scanner.nextLine();
        int quantity = Integer.parseInt(s);
        Book book = new Book(bookTitle, authorName, price, quantity);
        bookStorage.add(book);
        System.out.println("Book added successfully");
    }

    public static void printCommands() {
        System.out.println("Pleas input 0 for EXIT");
        System.out.println("Pleas input 1 for ADD BOOK");
        System.out.println("Pleas input 2 for PRINT ALL BOOKS");
        System.out.println("Pleas input 3 for SEARCH BOOK BY TITLE");
        System.out.println("Pleas input 4 for PRINT EXPENSIVE BOOK");
        System.out.println("Pleas input 5 for get book's IN PROVIDED INTERVAL");
        System.out.println("Pleas input  for DELETE BY INDEX");
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
