public class Book {
    public long id;
    public String title;
    public String author;
    public String description; 
    public BookType type;
    public int quantity; 

    public Book(long id, String title, String author, String description, BookType type, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.type = type;
        this.quantity = quantity; 
    }

    public String getSummary() {
        return String.format(
                "id: %d,%n    author: %s,%n    title: %s,%n    description: %s,%n    type: %s,%n    quantity: %d",
                this.id,
                this.author,
                this.title,
                this.description,
                this.type.toString(),
                this.quantity);
    }
}