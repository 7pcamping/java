import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt(); // Reading the size of the array

        // Initialize the array
        int numbers[] = new int[size];

        // Populate the array with user input
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        sc.close();
    }
}
OUTPUT:
Enter the size of the array: 4
Enter 4 numbers:
1 2 3 4
The elements of the array are:
1
2
3
4


