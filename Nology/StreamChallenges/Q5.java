import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
// import java.util.stream.Collectors;

public class Q5 {
    //  public static List<String> getUniqueItems(List<String> items) {
    // return items.stream()
    // .distinct()
    // .collect(Collectors.toList());
    // }

    // Using sets
    public static List<String> getUniqueItems(List<String> items) {
    return new ArrayList<>(new HashSet<>(items));
    }

    public static void main(String[] args) {
    List<String> items = Arrays.asList("apple", "banana", "apple", "orange",
    "banana", "apple");
    System.out.println(getUniqueItems(items));
    }
}
