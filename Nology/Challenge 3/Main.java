// ## Challenge: What's the number of x in y?

// -   Scan user input twice
// -   Allowed inputs:
//     -   `"s"` => seconds
//     -   `"m"` => minutes
//     -   `"h"` => hours
//     -   `"D"` => days
//     -   `"M"` => months
//     -   `"Y"` => years
// -   Input => Output Examples:
//     -   1st: `"M"`, 2nd: `"D"` => `"There are 30 days in a month"`
//     -   1st: `"M"`, 2nd: `"h"` => `"There are 720 hours in a month"`
//     -   1st: `"h"`, 2nd: `"s"` => `"There are 3600 seconds in an hour"`
//     -   1st: `"M"`, 2nd: `"Y"` => `"There are no years in a month"`
//     -   1st: `"s"`, 2nd: `"h"` => `"There are no hours in a second"`
// -   Assumptions:
//     -   There are 30 days in a month

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the number of X in Y?");

        System.out.print(
                "Enter Y ('s' for seconds, 'm' for minutes, 'h' for hours, 'D' for days, 'M' for months, 'Y' for years): ");
        String firstUnit = scanner.next();

        System.out.print(
                "Enter X ('s' for seconds, 'm' for minutes, 'h' for hours, 'D' for days, 'M' for months, 'Y' for years): ");
        String secondUnit = scanner.next();

        // Use a function to do the logic.
        String output = timeConversion(firstUnit, secondUnit);
        System.out.println(output);

        scanner.close();
    }

    // Private = only accessible within this class
    // i.e. can't be accessed outside of Main2
    private static String convertToText(String unit, boolean plural) {
        if (unit == null) {
            return "unknown unit";
        }
        switch (unit) {
            case "s":
                return plural ? "seconds" : "second";
            case "m":
                return plural ? "minutes" : "minute";
            case "h":
                return plural ? "hours" : "hour";
            case "D":
                return plural ? "days" : "day";
            case "M":
                return plural ? "months" : "month";
            case "Y":
                return plural ? "years" : "year";
            default:
                return "unknown units";
        }
    }

    private static String timeConversion(String inY, String X) {
        switch (inY) {
            case "s":
                if ("s".equals(X))
                    return "There is a " + convertToText("s", false) + " in a " + convertToText("s", false);
                ;
                break;
            case "m":
                if ("s".equals(X))
                    return "There are 60 " + convertToText("s", true) + " in a " + convertToText("m", false);
                if ("m".equals(X))
                    return "There is a " + convertToText("m", false) + " in a " + convertToText("m", false);
                break;
            case "h":
                if ("s".equals(X))
                    return "There are 3600 " + convertToText("s", true) + " in an " + convertToText("h", false);
                if ("m".equals(X))
                    return "There are 60 " + convertToText("m", true) + " in an " + convertToText("h", false);
                if ("h".equals(X))
                    return "There is an " + convertToText("h", false) + " in an " + convertToText("h", false);
                break;
            case "D":
                if ("s".equals(X))
                    return "There are 86400 " + convertToText("s", true) + " in a " + convertToText("D", false);
                if ("m".equals(X))
                    return "There are 1440 " + convertToText("m", true) + " in a " + convertToText("D", false);
                if ("h".equals(X))
                    return "There are 24 " + convertToText("h", true) + " in a " + convertToText("D", false);
                if ("D".equals(X))
                    return "There is a " + convertToText("D", false) + " in a " + convertToText("D", false);
                break;
            case "M":
                if ("s".equals(X))
                    return "There are 2592000 " + convertToText("s", true) + " in a " + convertToText("M", false);
                if ("m".equals(X))
                    return "There are 43200 " + convertToText("m", true) + " in a " + convertToText("M", false);
                if ("h".equals(X))
                    return "There are 720 " + convertToText("h", true) + " in a " + convertToText("M", false);
                if ("D".equals(X))
                    return "There are 30 " + convertToText("D", true) + " in a " + convertToText("M", false);
                if ("M".equals(X))
                    return "There is a " + convertToText("M", false) + " in a " + convertToText("M", false);
                break;
            case "Y":
                if ("s".equals(X))
                    return "There are 31536000 " + convertToText("s", true) + " in a " + convertToText("Y", false);
                if ("m".equals(X))
                    return "There are 525600 " + convertToText("m", true) + " in a " + convertToText("Y", false);
                if ("h".equals(X))
                    return "There are 8760 " + convertToText("h", true) + " in a " + convertToText("Y", false);
                if ("D".equals(X))
                    return "There are 365 " + convertToText("D", true) + " in a " + convertToText("Y", false);
                if ("M".equals(X))
                    return "There are 12 " + convertToText("M", true) + " in a " + convertToText("Y", false);
                if ("Y".equals(X))
                    return "There is a " + convertToText("Y", false) + " in a " + convertToText("Y", false);
                break;
        }
        return "There are no " + convertToText(X, true) + " in a " + convertToText(inY, false);
    }
}