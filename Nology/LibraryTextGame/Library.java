import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;
    private ArrayList<Book> checkedOut;
    public ArrayList<Book> userBooks;

    public Library(ArrayList<Book> books) {
        this.books = books;
        this.checkedOut = new ArrayList<>();
        this.userBooks = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public Book get(int id) throws Exception {
        for (Book book : books) {
            if (book.id == id) {
                return book;
            }
        }
        throw new Exception("\"That's not even a real book!\" The old librarian is not pleased.");
    }

public void checkout(Book book) throws Exception {
    if (book.quantity < 1) {
        throw new Exception("\"It's checked out, you fool! You can't check it out again.\" The old librarian is clearly upset.");
    }
        book.quantity--;
        this.checkedOut.add(book);
        book.checkedOut = true;
        this.userBooks.add(book);
    }

    public void checkin(Book book) throws Exception {
        Book bookFoundInCheckout = this.findBook(this.userBooks, book);
        if (bookFoundInCheckout == null && book.quantity == 1) {
            throw new Exception("\"You don't have it, you fool!\" He points to it on the shelf - literally a metre away from you. The old librarian is clearly upset.");
        } else if (bookFoundInCheckout == null && book.quantity == 0) {
            throw new Exception("\"You don't have it, you fool!\" Somebody else has checked it out.");
        } else {
            book.quantity++;
            book.checkedOut = false;
            this.checkedOut.remove(book);
            this.userBooks.remove(book);
        }
    }

    public Book findBook(ArrayList<Book> collection, Book book) {
        for (Book b : collection) {
            if (b.id == book.id) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> findBooks(String titleSubstring) {
    ArrayList<Book> foundBooks = new ArrayList<>();
    for (Book book : books) {
        if (book.title.toLowerCase().contains(titleSubstring.toLowerCase())) {
            foundBooks.add(book);
        }
    }
    return foundBooks;
}
public ArrayList<Book> getAvailableBooks() {
    ArrayList<Book> availableBooks = new ArrayList<>();
    for (Book book : books) {
        if (!book.checkedOut) { 
            availableBooks.add(book);
        }
    }
    return availableBooks;
}

public ArrayList<Book> getCheckedOutBooks() {
    ArrayList<Book> currentlyCheckedOut = new ArrayList<>();
    for (Book book : books) {
        if (book.checkedOut) {
            currentlyCheckedOut.add(book);
        }
    }
    return currentlyCheckedOut;
}
}