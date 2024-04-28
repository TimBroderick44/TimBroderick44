// There is a queue for the self-checkout tills at the supermarket.Your task is write a function to calculate the total time 
//required for all the customers to check out!

//INPUT:

// customers:an array of positive integers representing the queue.Each integer represents a customer,and its value is the amount of time they require to check out.
//n:a positive integer,the number of checkout tills.

//OUTPUT:

// The function should return an integer,the total time required.

//EXAMPLES:

// queueTime([5,3,4],1)
// // should return 12
// // because when there is 1 till, the total time is just the sum of the times

// queueTime([10,2,3,3],2)
// // should return 10
// // because here n=2 and the 2nd, 3rd, and 4th people in the 
// // queue finish before the 1st person has finished.

// queueTime([2,3,10],2)
// // should return 12


import java.util.Arrays;

public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        // set up the tills
        // e.g. [0, 0, 0, 0, 0] if n = 5
        // customers = [1, 2, 5, 10]
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            // add customer to the first till and sort the tills
            result[0] += customers[i];
            // sort the tills
            Arrays.sort(result);
        }
        // return the till with the longest time
        // because sorted it's the last element
        // n - 1 because the array is zero-indexed
        return result[n - 1];
    }

}

