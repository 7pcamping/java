import java.util.Scanner;

public class PrintName {

    // Function to print the given name
    public static void printName(String name) {
        System.out.println("The given name is: " + name);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Call the function to print the name
        printName(name);

        // Close the scanner
        scanner.close();
    }
}
