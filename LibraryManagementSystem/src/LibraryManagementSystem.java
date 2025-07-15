import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryDAO libraryDAO = new LibraryDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(0, title, author, false);
                    libraryDAO.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = scanner.nextInt();
                    libraryDAO.issueBook(issueId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scanner.nextInt();
                    libraryDAO.returnBook(returnId);
                    break;

                case 4:
                    List<Book> books = libraryDAO.getAllBooks();
                    System.out.println("\nAvailable Books:");
                    for (Book b : books) {
                        System.out.println(b.getId() + " | " + b.getTitle() + " | " + b.getAuthor() + " | Issued: " + (b.isIssued() ? "Yes" : "No"));
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
