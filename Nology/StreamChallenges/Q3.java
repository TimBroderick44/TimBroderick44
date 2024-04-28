import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static List<Integer> removeOddNumbers(List<Integer> numbers) {
    return numbers.stream()
    .filter(number -> number % 2 == 0)
    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    System.out.println(removeOddNumbers(numbers));
    }
}
