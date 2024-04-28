// There are three situations to think about:
// 1. X and Y are the same => "There is a second in a second." (Needs 'a' article and no plural)
//                            " There is an hour in an hour." (Needs 'an' article and no plural)
// 2. X is greater than Y => "There are 60 seconds in a minute." (Needs 'a' article and plural) 
//                           "There are 60 minutes in an hour." (Needs 'an' article and plural)
// 3. Y is greater than X => "There are no seconds in a minute." (Needs 'a' article and plural)
//                           "There are no years in an hour." (Needs 'an' article and plural)

// Super repititive so should use a HASHMAP:

// https://www.geeksforgeeks.org/java-util-hashmap-in-java-with-examples/

// HashMap<String, Integer> map = new HashMap<>();
// map.put("vishal", 10);
// if (map.containsKey("vishal"))

// FORMATTED STRINGS:

// https://www.geeksforgeeks.org/java-string-format-method-with-examples/

// %a = floating point (returns hex output though || hex = base 16)
// %b = any type (returns 'true' or 'false')
// %c = character
// %d = integer
// %e = floating point (scientific notation)
// %f = floating point (decimal notation)
// %g = floating point (decimal or scientific notation)
// %h = any type (returns hex string from hashCode())
// %n = newline
// %o = octal number
// %s = string
// %t = date/time
// %x = hex number

// ............... I'm just going to use %s, %d & %n. 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainV2 {
    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Final = can't be changed
    private static final Map<String, Integer> unitToSeconds = new HashMap<>();
    private static final Map<String, String> singularToPlural = new HashMap<>();

    static {
        // Convert everything to seconds (the smallest base unit)
        unitToSeconds.put("s", 1);
        unitToSeconds.put("m", 60);
        unitToSeconds.put("h", 3600);
        unitToSeconds.put("D", 86400);
        unitToSeconds.put("M", 2592000); 
        unitToSeconds.put("Y", 31536000);

        // Singular to plural mapping
        singularToPlural.put("s", "seconds");
        singularToPlural.put("m", "minutes");
        singularToPlural.put("h", "hours");
        singularToPlural.put("D", "days");
        singularToPlural.put("M", "months");
        singularToPlural.put("Y", "years");
    }

    // Public = accessible from outside of this class
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Void = doesn't return anything
    // Main method = entry point of the program

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Convert units of time:");
            System.out.print("Enter larger time unit ('s', 'h', 'm', 'D','M', 'Y'): ");
            String largerUnit = scanner.next();

            System.out.print("Enter smaller time unit ('s', 'h', 'm', 'D','M', 'Y'): ");
            String smallerUnit = scanner.next();

            // Use a function to do the logic and put the result into a variable, 'result'.
            String result = convertTimeUnits(largerUnit, smallerUnit);
            System.out.println(result);
        } finally {
            scanner.close();
        }
    }

    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Function requires two String inputs, 'largerUnit' and 'smallerUnit'
    private static String convertTimeUnits(String largerUnit, String smallerUnit) {
        // Consider if X is greater than Y
        // e.g. How many years inn a second? 
        if (!unitToSeconds.containsKey(largerUnit) || !unitToSeconds.containsKey(smallerUnit)) {
            return "Invalid units.";
        }

        // Get the number of seconds from the hashmap.
        int secondsInLargerUnit = unitToSeconds.get(largerUnit);
        int secondsInSmallerUnit = unitToSeconds.get(smallerUnit);

        // If X and Y are the same, needs a unique output.
        if (largerUnit.equals(smallerUnit)) {
            // Java has a unique way of building strings with variables
            // %s is a placeholder for a string
            // %d is a placeholder for a number
            // In this example, I'm going to use 4 different placeholders
            // So there are %s and then the 4 variables. 
            return String.format("There is %s %s in %s %s.",
            // 1st => Does it need an 'a' or 'an'?
            // 2nd => Value of 'Y' (with a count of '1')
            // 3rd => Does it need an 'a' or 'an'?
            // 4th => Value of 'X' (with a count of '1')
                    getArticle(smallerUnit),
                    formatUnit(smallerUnit, true),
                    getArticle(largerUnit),
                    formatUnit(largerUnit, true));
        }

        // If X is greater than Y and X, there will be a calculation (the resultOfDivision variable) 
        if (secondsInLargerUnit >= secondsInSmallerUnit) {
            // e.g. Days in a month:
            // 2592000 / 86400 = 30
            int resultOfDivision = secondsInLargerUnit / secondsInSmallerUnit;
            // Same as before: %s is a placeholder for a string, %d is a placeholder for a number.
            // Again, using 4 variables:
            // 1st => Value of the division
            // 2nd => Is it singular or plural & the unit?
            // 3rd => Does it need an 'a' or 'an'?
            // 4th => Is it singular or plral and the unit?
            return String.format("There are %d %s in %s %s.",
                    resultOfDivision,
                    formatUnit(smallerUnit, false),
                    getArticle(largerUnit),
                    formatUnit(largerUnit, true));
        } else {
            // Only, 3 variables:
            // 1st => Is it singular or plural and the unit?
            // 2nd => Does it need an 'a' or 'an'?
            // 3rd => Is it singular or plural and the unit?
            return String.format("There are no %s in %s %s.",
                    formatUnit(smallerUnit, false),
                    getArticle(largerUnit),
                    formatUnit(largerUnit, true));
        }
    }

    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Function requires two inputs, 'unit' and 'singular'
    private static String formatUnit(String unit, Boolean singular) {
        // If singular is true, use the unitToSingular function.
        // If false, use the hashmap.
        return singular == true ? unitToSingular(unit) : singularToPlural.get(unit);
    }

    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Function requires one input, 'unit' 
    private static String unitToSingular(String unit) {
        // Return the value of the hashmap, minus the last 's'.
        return singularToPlural.get(unit).substring(0, singularToPlural.get(unit).length() - 1);
    }

    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    // Static = doesn't produce an instance of the class
    // i.e. can be accessed without creating an object of the class
    // Function requires one input, 'unit'
    private static String getArticle(String unit) {
        // If the unit is 'hour', return 'an', else return 'a'.
        return (unit.equals("h") ? "an" : "a");
    }
}