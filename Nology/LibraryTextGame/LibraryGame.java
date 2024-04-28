import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LibraryGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Random random = new Random();

        // ChatGPT-created books

        // randomise checkedOut so 'feels' like a real library 

        books.add(createBook(1, "The Bee String", "Paul Murray", "A novel about life's intricacies.", BookType.FICTION, 1, random));
        books.add(createBook(2, "Biography of X", "Catherine Lacey", "A detailed biography.", BookType.NON_FICTION, 1, random));
        books.add(createBook(3, "A Day in the Life of Abed Salama", "Nathan Thrall", "A true story.", BookType.NON_FICTION, 1, random));
        books.add(createBook(4, "Lost Horizon", "James Hilton", "A novel about a mythical utopian valley.", BookType.FICTION, 1, random));
        books.add(createBook(5, "The Science of Mind", "Ernest Holmes", "Exploration of metaphysics and psychology.", BookType.NON_FICTION, 1, random));
        books.add(createBook(6, "The Art of War", "Sun Tzu", "Ancient Chinese military treatise.", BookType.NON_FICTION, 1, random));
        books.add(createBook(7, "Ender's Game", "Orson Scott Card", "A science fiction story about a young military genius.", BookType.FICTION, 1, random));
        books.add(createBook(8, "The Lighthouse Keeper", "Cynthia Ellingsen", "A story about love and loss.", BookType.FICTION, 1, random));
        books.add(createBook(9, "Digital Fortress", "Dan Brown", "Thriller about a cryptographic code that threatens the NSA.", BookType.FICTION, 1, random));
        books.add(createBook(10, "Educated", "Tara Westover", "A memoir about a woman who grew up with survivalists.", BookType.NON_FICTION, 1, random));
        books.add(createBook(11, "The Hobbit", "J.R.R. Tolkien", "A fantasy novel about a hobbit's journey.", BookType.FICTION, 1, random));
        books.add(createBook(12, "The Catcher in the Rye", "J.D. Salinger", "A novel about teenage alienation and loss.", BookType.FICTION, 1, random));
        books.add(createBook(13, "Sapiens", "Yuval Noah Harari", "A brief history of humankind.", BookType.NON_FICTION, 1, random));
        books.add(createBook(14, "Beloved", "Toni Morrison", "A novel based on the African-American experience.", BookType.FICTION, 1, random));
        books.add(createBook(15, "The Road Less Traveled", "M. Scott Peck", "A new psychology of love, traditional values and spiritual growth.", BookType.NON_FICTION, 1, random));
        books.add(createBook(16, "Atomic Habits", "James Clear", "An easy & proven way to build good habits & break bad ones.", BookType.NON_FICTION, 1, random));
        books.add(createBook(17, "Dune", "Frank Herbert", "A science fiction saga about politics and power.", BookType.FICTION, 1, random));
        books.add(createBook(18, "1984", "George Orwell", "A dystopian novel about totalitarianism.", BookType.FICTION, 1, random ));
        books.add(createBook(19, "The Great Gatsby", "F. Scott Fitzgerald", "A novel about the American Dream.", BookType.FICTION, 1, random));
        books.add(createBook(20, "The Alchemist", "Paulo Coelho", "A novel about a young Andalusian shepherd.", BookType.FICTION, 1, random));

        Library library = new Library(books);

        System.out.println("You enter the library. Ahead of you is a librarian older than time. He looks up at you as all the bones in his body creak.");
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Show all books");
            System.out.println("2. Show available books");
            System.out.println("3. Show checked out books");
            System.out.println("4. Check out a book");
            System.out.println("5. Check in a book");
            System.out.println("6. Search for a book by title");
            System.out.println("7. Check your checked out books out");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        printBooks(books);
                        break;
                    case 2:
                        printBooks(library.getAvailableBooks());
                        break;
                    case 3:
                        printBooks(library.getCheckedOutBooks());
                        break;
                    case 4:
                        System.out.print(" The old man radiates with impatience and distain. \"What book are you checking out?\" he asks. Enter the ID:");
                        int checkoutId = scanner.nextInt();
                        Book bookToCheckout = library.get(checkoutId);
                        if (bookToCheckout != null) {
                            library.checkout(bookToCheckout); 
                            System.out.println("With the strength of a lion, the old man launches the book at you.");
                        }
                        break;
                    case 5:
                        System.out.print("The old man impatiently taps his foot. \"What book are you checking in?\" he asks. Enter the ID:");
                        int checkinId = scanner.nextInt();
                        Book bookToCheckin = library.get(checkinId);
                        if (bookToCheckin != null) {
                            library.checkin(bookToCheckin);
                            System.out.println("The old does not look pleased at having to do more work.");
                        }
                        break;
                    case 6:
                        System.out.print("Enter the title or part of the title to search: ");
                        String titleSubstring = scanner.nextLine();
                        ArrayList<Book> foundBooks = library.findBooks(titleSubstring);
                        if (foundBooks.isEmpty()) {
                            System.out.println("The old man seethes. \"That's not even a book!\" he exclaims. He bangs his fist on the desk. You're pretty sure he's just fractured his hand.");
                        } else {
                            System.out.println("\"We've got these books\" he says, pointing to a pile of books. \"Most will be too difficult for you to read though\"");
                            for (Book foundBook : foundBooks) {
                                System.out.println(foundBook.getSummary());
                            }
                        }
                        break;
                    case 7:
                        System.out.println("You hear an audible sigh from the old man. \"Fine,\" he says. \"Here are the books you have checked out.\"");
                        if (library.userBooks.isEmpty()) {
                            System.out.println("No books checked out.");
                        } else {
                            printBooks(library.userBooks);
                        }
                        break;
                    case 8:
                        exit = true;
                        System.out.println("What an a&%hole you think to yourself as you leave the library.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }

    private static Book createBook(int id, String title, String author, String description, BookType type, Integer quantity,
            Random random) {
        boolean checkedOut = random.nextBoolean();
        quantity = checkedOut ? 0 : 1;
        return new Book(id, title, author, description, type, quantity, checkedOut);
    }

    private static void printBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("The old looks you up and down, \"You're not holding anything\"");
        } else {
            for (Book book : books) {
                System.out.println(book.getSummary());
            }
        }
    }
}