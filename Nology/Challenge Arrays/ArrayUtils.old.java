import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayUtils {
    public static int[] incrementArray(int[] arr) {
        // Create a new array of the same length
        int[] myArray = new int[arr.length];
        
        // Iterate over the original array and add 1 to each element
        for (int i = 0; i < arr.length; i++) {
        myArray[i] = arr[i] + 1;
        }
        
        return myArray;
    }
}

    public static int[] reverseArray(int[] arr) {
        // Create a new array of the same length
        int[] reversed = new int[arr.length];
        
        // Iterate over the original array
        // Assign the value at the current index to the new array
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(incrementArray(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(incrementArray(new int[] {1000, 2, 31})));
        System.out.println(Arrays.toString(incrementArray(new int[] {})));

        System.out.println(Arrays.toString(reverseArray(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(reverseArray(new int[] {1000, 2, 31})));
        System.out.println(Arrays.toString(reverseArray(new int[] {})));
    }
