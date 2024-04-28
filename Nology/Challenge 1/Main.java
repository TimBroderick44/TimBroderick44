// First Java Challenge (Use the cheat sheet provided above and google as much as you can)
// Create an array of 3 colleague names E.g: {"Abigail", "Stacey", "Tim"}
// Print each name in a loop with an index 1. Abigail -> 2. Stacey -> etc


public class Main {
    public static void main(String[] args) {
        // Is size important? By size does it mean memory allocation?
        String[] colleagues = { "Abigail", "Stacey", "Isaac", "Oliver", "Priyanka", "Ammara", "Seth", "Michelle", "Dalia", "Chloe" };

        System.out.println("My colleagues are:");

        for (int i = 0; i < colleagues.length; i++) {
            // -2 ==> Second from the end so use '&'
            if (i == colleagues.length - 2) {
                System.out.print((i + 1) + ". " + colleagues[i] + " & ");
            // -1 ==> Last so don't need an arrow and Println = drop down a line
            } else if (i == colleagues.length - 1) {
                System.out.println((i + 1) + ". " + colleagues[i]);
            } else {
                System.out.print((i + 1) + ". " + colleagues[i] + " -> ");
            }
        }
    }
}
