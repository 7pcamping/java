import java.util.Scanner;

public class FactorialCalculator {
    // Function to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate factorial for both numbers
        int fact1 = factorial(num1);
        int fact2 = factorial(num2);

        // Output the results
        System.out.println("Factorial of " + num1 + " is: " + fact1);
        System.out.println("Factorial of " + num2 + " is: " + fact2);

        scanner.close();
    }
}

output:
Enter the first number: 4  
Enter the second number: 5

Factorial of 4 is: 24  
Factorial of 5 is: 120


