// TestNumberTools.java

import java.util.Scanner;

public class TestNumberTools {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter an integer to test: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Non-integer entered. Exiting program.");
                break; // Exit the loop if a non-integer is entered
            }
            int value = scanner.nextInt();

            // Test the entered value against each function in NumberTools
            System.out.println("Is " + value + " an even number? " + (NumberTools.isEven(value) ? "Yes." : "No."));
            System.out.println("Is " + value + " a positive number? " + (NumberTools.isPositive(value) ? "Yes." : "No."));
            System.out.println("Is " + value + " a Fibonacci number? " + (NumberTools.isFibonacci(value) ? "Yes." : "No."));
            System.out.println("Is " + value + " a power of two? " + (NumberTools.isPowerOfTwo(value) ? "Yes." : "No."));
            System.out.println("Is " + value + " a prime number? " + (NumberTools.isPrime(value) ? "Yes." : "No."));
            System.out.println("Is " + value + " a square number? " + (NumberTools.isSquare(value) ? "Yes." : "No."));
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
