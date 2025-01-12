import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Taking two inputs from the user
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Comparing the values of a and b
        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("greater");
        } else {
            System.out.println("lesser");
        }

        // Close the scanner
        scanner.close();
    }
}

      
