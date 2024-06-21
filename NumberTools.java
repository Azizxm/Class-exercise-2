// NumberTools.java

public class NumberTools {

    // Checks if the given value is even
    public static boolean isEven(int value) {
        return value % 2 == 0; // An even number is divisible by 2 with no remainder
    }

    // Checks if the given value is positive
    public static boolean isPositive(int value) {
        return value > 0; // A positive number is greater than zero
    }

    // Checks if the given value is a Fibonacci number
    public static boolean isFibonacci(int value) {
        if (value <= 0) {
            return false; // Fibonacci numbers are positive
        }
        int a = 1, b = 1;
        if (value == a || value == b) {
            return true; // The first two Fibonacci numbers are 1 and 1
        }
        int c = a + b;
        while (c <= value) {
            if (c == value) {
                return true; // If value matches the current Fibonacci number, return true
            }
            a = b; // Move to the next Fibonacci number
            b = c;
            c = a + b;
        }
        return false; // If we surpass value, it is not a Fibonacci number
    }

    // Checks if the given value is a power of two
    public static boolean isPowerOfTwo(int value) {
        if (value <= 0) {
            return false; // Powers of two are positive
        }
        return (value & (value - 1)) == 0; // A power of two in binary form has only one bit set
    }

    // Checks if the given value is a prime number
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false; // If value is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, value is prime
    }

    // Checks if the given value is a square number
    public static boolean isSquare(int value) {
        if (value < 0) {
            return false; // Negative numbers cannot be square numbers
        }
        int sqrt = (int) Math.sqrt(value); // Find the integer part of the square root
        return sqrt * sqrt == value; // Check if the square of the integer part equals the original value
    }
}
