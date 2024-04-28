// ## Challenge: Primitive Types

// ### MVP:

// Challenge 1: Create a byte, short, integer and double. Use a scanner to get numerical input from the terminal

// 1. Produce an integer by dividing your byte by a number input in the terminal
// 2. Produce a long by multiplying your short by a number input in the terminal
// 3. Produce a double by dividing your integer by a number input in the terminal
// 4. Produce a char that is the first character in a string input in the terminal

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a byte (-128 to 127): ");
        byte myByte = scanner.nextByte();
        // while (myByte < -128 || myByte > 127) {
        //     System.out.print("Enter a byte (-128 to 127): ");
        //     myByte = scanner.nextByte();
        // }

        System.out.print("Enter a short (-32 768 to 32 767): ");
        short myShort = scanner.nextShort();
        // while (myShort < -32768 || myShort > 32767) {
        //     System.out.print("Enter a short (-32 768 to 32 767): ");
        //     myShort = scanner.nextShort();
        // }

        System.out.print("Enter an integer (-2,147,483,648 to 2,147,483,647): ");
        int myInt = scanner.nextInt();
        // while (myInt < -2147483648 || myInt > 2147483647) {
        //     System.out.print("Enter an integer (-2,147,483,648 to 2,147,483,647): ");
        //     myInt = scanner.nextInt();
        // }

        System.out.print("Enter a number to divide the byte by: ");
        int divideByte = scanner.nextInt();
        int myDivideByte = myByte / divideByte;
        System.out.println("The result of dividing " + myByte + " by " + divideByte + " is: " + myDivideByte);

        System.out.print("Enter a number to multiply the short by: ");
        int multiplyShort = scanner.nextInt();
        long myMultiplyShort = myShort * multiplyShort;
        System.out.println("The result of multiplying " + myShort + " by " + multiplyShort + " is: " + myMultiplyShort);

        System.out.print("Enter a number to divide the integer by: ");
        int divideInt = scanner.nextInt();
        double myDivideInt = myInt / (double) divideInt;
        System.out.println("The result of dividing " + myInt + " by " + divideInt + " is: " + myDivideInt);

        System.out.print("Enter a string: ");
        String myString = scanner.next();
        char myChar = myString.charAt(0);
        System.out.println("The first character of the string is: " + myChar);

        scanner.close();
    }
}