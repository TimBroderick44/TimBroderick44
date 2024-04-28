class Library {
    private ArrayList<Book> books;
    private ArrayList<Book> checkedOut;

    public Library(ArrayList<Book> books) {
        this.books = books;
        this.checkedOut = new ArrayList<>();
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public void remove(Book book) throws Exception {
        if (this.findBook(this.checkedOut, book) != null) {
            throw new Exception("Cannot remove book; it is currently checked out!");
        }
        this.books.removeIf(b -> b.id == book.id);
    }

    public Book get(int id) throws Exception {
        for (Book book : books) {
            if (book.id == id) {
                return book;
            }
        }
        throw new Exception("Book id doesn't exist!");
    }

    public void checkout(Book book) throws Exception {
        if (book.quantity < 1) {
            throw new Exception("No more copies available for checkout!");
        }
        book.quantity--;
        this.checkedOut.add(book);
    }

    public void checkin(Book book) throws Exception {
        Book bookFoundInCheckout = this.findBook(this.checkedOut, book);
        if (bookFoundInCheckout == null) {
            throw new Exception("Book cannot be checked in; it was never checked out!");
        }
        book.quantity++;
        this.checkedOut.removeIf(b -> b.id == book.id);
    }

    private Book findBook(ArrayList<Book> collection, Book book) {
        for (Book b : collection) {
            if (b.id == book.id) {
                return b;
            }
        }
        return null;
    }

    public ArrayList<Book> getAvailableBooks() {
        return books;
    }

    public ArrayList<Book> getCheckedOutBooks() {
        return checkedOut;
    }
}