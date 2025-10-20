package homework.library;

import java.util.Scanner;

public class LibraryDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean izRun = true;

        while (izRun) {
            System.out.println("Pleas input 0 for EXIT");
            System.out.println("Pleas input 1 for ADD BOOK");
            System.out.println("Pleas input 2 for PRINT ALL BOOKS");
            System.out.println("Pleas input 3 for SEARCH BOOK BY TITLE");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    izRun = false;
                    break;
                case "1":
                    System.out.println("Pleas input book's title");
                    String bookTitle = scanner.nextLine();
                    System.out.println("Pleas input book's authorName");
                    String authorName = scanner.nextLine();
                    System.out.println("Pleas input book's price");
                    double price = Double.parseDouble(scanner.nextLine());
                    Book book = new Book(bookTitle, authorName, price);
                    bookStorage.add(book);
                    System.out.println("Book added successfully");
                    break;
                case "2":
                    bookStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
            }
        }
    }
}
