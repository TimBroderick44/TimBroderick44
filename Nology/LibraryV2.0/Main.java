import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create books
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Bee String", "Paul Murray", "A novel about life's intricacies.", BookType.FICTION, 3));
        books.add(new Book(2, "Biography of X", "Catherine Lacey", "A detailed biography.", BookType.FICTION, 5));
        books.add(new Book(3, "A Day in the Life of Abed Salama", "Nathan Thrall", "A true story.", BookType.NON_FICTION, 2));

        // Create and manage library
        Library library = new Library(books);
        library.add(new Book(4, "Fear Is Just a Word", "Azam Ahmed", "Inspiring true events.", BookType.NON_FICTION, 4));

        // Checkout and checkin functionalities
        Book selectedBook = library.get(3);
        System.out.println(selectedBook.getSummary());
        library.checkout(selectedBook);

        // Attempt to remove a book
        try {
            library.remove(selectedBook);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }

        // Check in the book and attempt removal again
        library.checkin(selectedBook);
        try {
            library.remove(selectedBook);
            System.out.println("Book removed successfully.");
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }
}