package homework.library;

public interface Commands {

    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_BOOK = "2";
    String PRINT_ALL_AUTHORS = "3";
    String PRINT_ALL_BOOKS = "4";
    String SEARCH_BOOK_BY_TITLE = "5";
    String SEARCH_BOOK_BY_AUTHOR = "6";
    String PRINT_EXPENSIVE_BOOK = "7";
    String IN_PROVIDED_INTERVAL = "8";
    String DELETE_BY_INDEX = "9";

    static void printAuthorAndBookCommands() {
        System.out.println("Pleas input " + EXIT + " for EXIT");
        System.out.println("Pleas input " + ADD_AUTHOR + " for ADD AUTHORS");
        System.out.println("Pleas input " + ADD_BOOK + " for ADD BOOK");
        System.out.println("Pleas input " + PRINT_ALL_AUTHORS + " for PRINT ALL AUTHORS");
        System.out.println("Pleas input " + PRINT_ALL_BOOKS + " for PRINT ALL BOOKS");
        System.out.println("Pleas input " + SEARCH_BOOK_BY_TITLE + " for SEARCH BOOK BY TITLE");
        System.out.println("Pleas input " + SEARCH_BOOK_BY_AUTHOR + " for SEARCH BOOK BY AUTHORS");
        System.out.println("Pleas input " + PRINT_EXPENSIVE_BOOK + " for PRINT EXPENSIVE BOOK");
        System.out.println("Pleas input " + IN_PROVIDED_INTERVAL + " for get book's IN PROVIDED INTERVAL");
        System.out.println("Pleas input " + DELETE_BY_INDEX + " for DELETE BY INDEX");
    }
}
