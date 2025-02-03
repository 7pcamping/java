public class FibonacciRecursion {
    
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 10; // Number of Fibonacci terms to display
        System.out.println("Fibonacci Series using Recursion:");
        
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
OUTPUT:
Fibonacci Series using Recursion:
0 1 1 2 3 5 8 13 21 34 

