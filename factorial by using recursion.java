public class Factorial {
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to test different numbers
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
