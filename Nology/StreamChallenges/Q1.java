import java.util.HashMap;
import java.util.Map;

public class Q1 {
public static String findIsbnByTitle(HashMap<String, String> books, String
    title) {
    return books.entrySet()
    .stream()
    .filter(entry -> entry.getValue().equals(title))
    .map(Map.Entry::getKey)
    .findAny()
    .orElse(null);
    }

    public static void main(String[] args) {

    HashMap<String, String> books = new HashMap<>();
    books.put("978-19283746", "Macbeth");
    books.put("978-99112288", "King Lear");
    books.put("965-99911128", "A Midsummer Night's Dream");
    books.put("965-97887998", "Hamlet");
    books.put("954-12345678", "Othello");

    System.out.println(findIsbnByTitle(books, "Macbeth"));

    }
}
