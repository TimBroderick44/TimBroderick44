import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a float: ");
        float float1 = scanner.nextFloat();

        System.out.print("Enter another float: ");
        float float2 = scanner.nextFloat();

        // Formatting floats to strings rounded to 3 decimal places
        String roundedFloat1 = String.format("%.3f", float1);
        String roundedFloat2 = String.format("%.3f", float2);

        // Comparing the formatted strings
        if (roundedFloat1.equals(roundedFloat2)) {
            System.out.println("Both numbers are " + roundedFloat1 + " after rounding");
        } else {
            System.out.println(roundedFloat1 + " and " + roundedFloat2 + " are different numbers");
        }

        scanner.close();
    }
}