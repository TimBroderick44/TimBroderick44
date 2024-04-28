import java.util.Arrays;
import java.util.List;

public class Q7 {
    public static int findItem(List<Integer> sortedArr, int searchItem) {
        int start = 0;
        int end = sortedArr.size() - 1;
        int iterations = 0;

        while (start <= end) {
            iterations++;
            int mid = start + (end - start) / 2;
            System.out.println(mid);

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

    private static int binarySearchRecursive(List<Integer> sortedArr, int searchItem, int start, int end, int iterations) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        iterations++;
        System.out.println(mid);

        if (sortedArr.get(mid) == searchItem) {
            return iterations;
        } else if (sortedArr.get(mid) < searchItem) {
            return binarySearchRecursive(sortedArr, searchItem, mid + 1, end, iterations);
        } else {
            return binarySearchRecursive(sortedArr, searchItem, start, mid - 1, iterations);
        }
    }

    public static void main(String[] args) {
        List<Integer> sortedArr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // System.out.println(Q7.findItem(sortedArr, 7));
        System.out.println(Q7.binarySearchRecursive(sortedArr, 8, 0, sortedArr.size() - 1, 0));
    }
}

// Output
// 4  (this is the index but the value is 5)
// 7  (this is the index but the value is 8)
// 2  

