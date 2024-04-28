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


    /**
     * Return only the books with isbn codes that begin with '978'
     *
     * @param books - hashmap of books and corresponding isbn
     * @return new list of only books whose isbn contains '978'
     */
    
    /**
     * Use stream to remove all odd number from the collection
     *
     * @param numbers - The list we are filtering
     * @return List of even numbers
     */

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

    /**
     * Filter a list to only return unique/distinct items in an array without using
     * a Set
     *
     * Extension: How would you do this using sets?
     *
     * @param items - The list we are filtering
     * @return The distinct/unique items in the list
     */

    /**
     * Using a Hash Map, create a binary translator for the first 5 letters of the
     * alphabet. If the letter doesn't exist, return -1
     *
     * @param letter - Letter we are translating
     * @return The binary code translation
     */
    
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
    
}