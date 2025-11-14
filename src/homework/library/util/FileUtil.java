package homework.library.util;

import homework.library.storage.AuthorStorage;
import homework.library.storage.BookStorage;

import java.io.*;

public abstract class FileUtil {

    private static final String BOOK_DATA_FILE = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\homework\\library\\Data\\bookData.data";
    private static final String AUTHOR_DATA_FILE = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\homework\\library\\Data\\authorData.data";

    public static void serializeBookData(BookStorage bookStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(BOOK_DATA_FILE))) {
            outputStream.writeObject(bookStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Book Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Book Data" + e);
        }
    }

    public static void serializeAuthorData(AuthorStorage authorStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(AUTHOR_DATA_FILE))) {
            outputStream.writeObject(authorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Author Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Author Data" + e);
        }
    }

    public static AuthorStorage deserializeAuthorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(AUTHOR_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if (object instanceof AuthorStorage authorStorage) {
                return authorStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Author Data" + e);
        } catch (IOException e) {
            System.out.println("File nor found for Author Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new AuthorStorage();
    }

    public static BookStorage deserializeBookStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(AUTHOR_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if (object instanceof BookStorage bookStorage) {
                return bookStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Author Data" + e);
        } catch (IOException e) {
            System.out.println("File nor found for Author Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new BookStorage();
    }
}
