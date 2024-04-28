import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge {

    // -------------- FOUNDATION --------------

    /**
     * You are given a HashMap of book titles and their corresponding
     * isbn codes. Find the isbn code that corresponds to the given title String.
     *
     * @param books - {"978-19283746" = "Macbeth"
     *              "978-99112288" = "King Lear"
     *              "965-99911128" = "A Midsummer Night's Dream"
     *              "965-97887998" = "Hamlet"
     *              "954-12345678" = "Othello"}
     *
     * @param title - The title String with which we are searching: example ->
     *              "Macbeth"
     * @return isbn - String contain isbn code: example -> "978-19283746"
     */

    // public static String findIsbnByTitle(HashMap<String, String> books, String
    // title) {
    // return books.entrySet()
    // .stream()
    // .filter(entry -> entry.getValue().equals(title))
    // .map(Map.Entry::getKey)
    // .findAny()
    // .orElse(null);
    // }

    // public static void main(String[] args) {

    // HashMap<String, String> books = new HashMap<>();
    // books.put("978-19283746", "Macbeth");
    // books.put("978-99112288", "King Lear");
    // books.put("965-99911128", "A Midsummer Night's Dream");
    // books.put("965-97887998", "Hamlet");
    // books.put("954-12345678", "Othello");

    // System.out.println(findIsbnByTitle(books, "Macbeth"));

    // }

    /**
     * Return only the books with isbn codes that begin with '978'
     *
     * @param books - hashmap of books and corresponding isbn
     * @return new list of only books whose isbn contains '978'
     */
    // public static String filterByIsbn(HashMap<String, String> books) {
    // return books.entrySet()
    // .stream()
    // .filter(entry -> entry.getKey().startsWith("978"))
    // .map(Map.Entry::getValue)
    // .collect(Collectors.joining(", "));
    // }

    // public static void main(String[] args) {
    // HashMap<String, String> books = new HashMap<>();
    // books.put("978-19283746", "Macbeth");
    // books.put("978-99112288", "King Lear");
    // books.put("965-99911128", "A Midsummer Night's Dream");
    // books.put("965-97887998", "Hamlet");
    // books.put("954-12345678", "Othello");

    // System.out.println(filterByIsbn(books));
    // }

    /**
     * Use stream to remove all odd number from the collection
     *
     * @param numbers - The list we are filtering
     * @return List of even numbers
     */
    // public static List<Integer> removeOddNumbers(List<Integer> numbers) {
    // return numbers.stream()
    // .filter(number -> number % 2 == 0)
    // .collect(Collectors.toList());
    // }

    // public static void main(String[] args) {
    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    // System.out.println(removeOddNumbers(numbers));
    // }

    // -------------- INTERMEDIATE --------------

    /**
     * You are trying to gather data analytics for a weekly publication. You want to
     * know how many women between the age of 20 - 40 have subscribed to your
     * service in
     * the last week.
     * 
     * @param subscribers - List<Subscribers> - a list of the latest total
     *                    subscribers
     * @return new list of only subscribers whose gender = female, and 20 <= age <=
     *         40
     */
    // public List<Subscriber> weeklyFemaleSubscribers(List<Subscriber> subscribers)
    // {
    // return subscribers.stream()
    // .filter(subscriber -> subscriber.getGender().equals("female") &&
    // subscriber.getAge() >= 20 && subscriber.getAge() <= 40)
    // .collect(Collectors.toList());
    // }

    /**
     * Filter a list to only return unique/distinct items in an array without using
     * a Set
     *
     * Extension: How would you do this using sets?
     *
     * @param items - The list we are filtering
     * @return The distinct/unique items in the list
     */
    // public static List<String> getUniqueItems(List<String> items) {
    // return items.stream()
    // .distinct()
    // .collect(Collectors.toList());
    // }

    // Using sets
    // public static List<String> getUniqueItems(List<String> items) {
    // return new ArrayList<>(new HashSet<>(items));
    // }

    // public static void main(String[] args) {
    // List<String> items = Arrays.asList("apple", "banana", "apple", "orange",
    // "banana", "apple");
    // System.out.println(getUniqueItems(items));
    // }

    /**
     * Using a Hash Map, create a binary translator for the first 5 letters of the
     * alphabet. If the letter doesn't exist, return -1
     *
     * @param letter - Letter we are translating
     * @return The binary code translation
     */
    // public static int getBinaryTranslation(char letter) {
    // HashMap<Character, Integer> binaryTranslator = new HashMap<>();
    // binaryTranslator.put('a', 0);
    // binaryTranslator.put('b', 1);
    // binaryTranslator.put('c', 10);
    // binaryTranslator.put('d', 11);
    // binaryTranslator.put('e', 100);

    // if (binaryTranslator.containsKey(letter)) {
    // return binaryTranslator.get(letter);
    // }

    // return -1;
    // }

    // public static void main(String[] args) {
    // System.out.println(getBinaryTranslation('a'));
    // }

    // -------------- ADVANCED --------------

    /**
     * Without using any helper functions. Implement a binary search algorithm to
     * search for an item in a sorted array.
     * A binary search uses a "Divide and Conquer" approach. It should divide an
     * array in two, check if the middle value is the searchItem,
     * else if the searchItem is greater than the middle, repeat the same process in
     * the top half of the array, and vise versa for
     * the lower half if the searchItem is less than the middle
     *
     * EXTENSION: Once you've completed this without recursion. Consider how this
     * could be done using recursion, you can even alter the method declaration ;)
     *
     * @param sortedArr
     * @param searchItem
     * @return The number of iterations required to find the item
     */
    public int findItem(List<Integer> sortedArr, int searchItem) {
        int start = 0;
        int end = sortedArr.size() - 1;
        int iterations = 0;

        while (start <= end) {
            iterations++;
            int mid = start + (end - start) / 2;

            if (sortedArr.get(mid) == searchItem) {
                return iterations;
            }

            if (sortedArr.get(mid) < searchItem) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public int findItemRecursive(List<Integer> sortedArr, int searchItem) {
        return binarySearchRecursive(sortedArr, searchItem, 0, sortedArr.size() - 1, 0);
    }

    private int binarySearchRecursive(List<Integer> sortedArr, int searchItem, int start, int end, int iterations) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        iterations++;

        if (sortedArr.get(mid) == searchItem) {
            return iterations;
        } else if (sortedArr.get(mid) < searchItem) {
            return binarySearchRecursive(sortedArr, searchItem, mid + 1, end, iterations);
        } else {
            return binarySearchRecursive(sortedArr, searchItem, start, mid - 1, iterations);
        }
    }

    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        List<Integer> sortedArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(challenge.findItem(sortedArr, 7));
        System.out.println(challenge.findItemRecursive(sortedArr, 8));
    }
}
