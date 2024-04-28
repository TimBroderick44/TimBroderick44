import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        return Math.sqrt(a);
    }

public double menu(double a, double b, char operator) {
    switch (operator) {
        case '+':
            return add(a, b);
        case '-':
            return subtract(a, b);
        case '*':
            return multiply(a, b);
        case '/':
            return divide(a, b);
        case '^':
            return power(a, b);
        case 's':
            return sqrt(a); 
        default:
            throw new IllegalArgumentException("Invalid operator");
    }
}


public void startCalculator() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    double num1 = scanner.nextDouble();

    System.out.println("Enter the operator (+, -, *, /, ^, s for sqrt):");
    char operator = scanner.next().charAt(0);

    double num2 = 0;
    if (operator != 's') {
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();
    }

    double result = menu(num1, num2, operator);
    System.out.println("Result: " + result);

    scanner.close();
}

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.startCalculator();
    }
}