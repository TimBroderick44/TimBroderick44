import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2 {
public static String filterByIsbn(HashMap<String, String> books) {
    return books.entrySet()
    .stream()
    .filter(entry -> entry.getKey().startsWith("978"))
    .map(Map.Entry::getValue)
    .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
    HashMap<String, String> books = new HashMap<>();
    books.put("978-19283746", "Macbeth");
    books.put("978-99112288", "King Lear");
    books.put("965-99911128", "A Midsummer Night's Dream");
    books.put("965-97887998", "Hamlet");
    books.put("954-12345678", "Othello");

    System.out.println(filterByIsbn(books));
    }
}
