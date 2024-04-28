import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtils {
    public static int[] incrementArray(int[] arr) {
        return Arrays.stream(arr)
            .map(n -> n + 1)
            .toArray();

            // Arrays.stream(arr) ===> IntStream (let's me use map, filter, etc.)
            //         ---> As oppposed to the next challenge, this created an IntStream from the array 

            // without .toArray() ===> error: incompatible types: IntStream cannot be converted to int[]

            // In English = IntStream is not an int[] array 
            // Stream = Source (collection, array, etc.) -> Intermediate Operations (map, collect, reduce) -> Terminal Operations (the result or side effect)

            // Here = Source (arr) -> Intermediate Operations (map) -> Terminal Operations (toArray)            
    }

    public static int[] reverseArray(int[] arr) {
        return IntStream.range(0, arr.length)
            .map(i -> arr[arr.length - i - 1])
            .toArray();
    }

    // Why not Arrays.stream(arr) ? IntStream.range provides a list of consecutive integers from 0 to arr.length that we can use to index the array

    // IntStream.range = Create a stream of ints from 0 to arr.length 

    // IntStream.range = Create a stream of ints from 0 to arr.length
    // map gets the last element and puts it in the first position
    // Doesn't modify the original array, creates a new one

    // e.g. 
    // arr = [1, 2, 3]
    // i = 0, arr.length = 3, arr[3 - 0 - 1] = arr[2] = 3 &&  newArr[0] = 3 (zero comes from IntStream.range(0, arr.length)
    // i = 1, arr.length = 3, arr[3 - 1 - 1] = arr[1] = 2 &&  newArr[1] = 2 (one comes from IntStream.range(0, arr.length)
    // i = 2, arr.length = 3, arr[3 - 2 - 1] = arr[0] = 1 &&  newArr[2] = 1 (two comes from IntStream.range(0, arr.length)
    // [3, 2, 1]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(incrementArray(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(incrementArray(new int[] {1000, 2, 31})));
        System.out.println(Arrays.toString(incrementArray(new int[] {})));

        System.out.println(Arrays.toString(reverseArray(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(reverseArray(new int[] {1000, 2, 31})));
        System.out.println(Arrays.toString(reverseArray(new int[] {})));
    }
}
