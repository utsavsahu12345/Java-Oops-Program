import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Title : " + title + ",Author : " + author;
    }
}

class Libaray {
    private List<Book> books;

    public Libaray() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Book in the library : ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class Oops_Project {
    public static void main(String[] aregs) {
        Libaray libaray = new Libaray();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + "Welcome to libaray" + "\n");
            System.out.println("\n" + "1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit" + "\n");
            System.out.print("Enter the option ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title : ");
                    String title = scanner.next();
                    System.out.print("Enter book author : ");
                    String author = scanner.next();
                    Book newBook = new Book(title, author);
                    libaray.addBook(newBook);
                    break;
                case 2:
                    libaray.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting the library system ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. ");
                    break;
            }
        }
    }
}
