import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; }

    public String getTitle() {
        return title;}

    public boolean isAvailable() {
        return available;}

    public void borrowBook() {
        available = false;   }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Status: " + (available ? "Available" : "Borrowed");
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Clean Code", "Robert C. Martin"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
[4/6/2026 1:47 AM] Nurin Najwa FT6A: import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Status: " + (available ? "Available" : "Borrowed");
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Clean Code", "Robert C. Martin"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 0:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }

    static void viewBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void addBook() {
        System.out.print("Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        books.add(new Book(title, author));
        System.out.println("Book Added Successfully!");
    }

    static void borrowBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.borrowBook();
                    System.out.println("Book Borrowed Successfully!");
                } else {
                    System.out.println("Book Already Borrowed.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void returnBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book Returned Successfully!");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void searchBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }

        System.out.
[4/6/2026 1:47 AM] Nurin Najwa FT6A: println("Book Not Found.");
    }
}[4/6/2026 1:47 AM] Nurin Najwa FT6A: import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrowBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Status: " + (available ? "Available" : "Borrowed");
    }
}

public class LibraryManagementSystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Clean Code", "Robert C. Martin"));

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 0:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }

    static void viewBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void addBook() {
        System.out.print("Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        books.add(new Book(title, author));
        System.out.println("Book Added Successfully!");
    }

    static void borrowBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.borrowBook();
                    System.out.println("Book Borrowed Successfully!");
                } else {
                    System.out.println("Book Already Borrowed.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void returnBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book Returned Successfully!");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void searchBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }

        System.out.
[4/6/2026 1:47 AM] Nurin Najwa FT6A: println("Book Not Found.");
    }
}
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 0:
                    System.out.println("Program Ended.");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }

    static void viewBooks() {
        System.out.println("\n--- Book List ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    static void addBook() {
        System.out.print("Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        books.add(new Book(title, author));
        System.out.println("Book Added Successfully!");
    }

    static void borrowBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.borrowBook();
                    System.out.println("Book Borrowed Successfully!");
                } else {
                    System.out.println("Book Already Borrowed.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void returnBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                System.out.println("Book Returned Successfully!");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    static void searchBook() {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book Not Found.");
    }
}