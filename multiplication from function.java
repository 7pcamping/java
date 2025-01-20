import java.util.*;
public class Functions { 
    public static int calculateMul(int a, int b) {
        int mul = a * b;
        return mul;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter first number: "); 
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        int mul = calculateMul(a, b); 
        System.out.println("Product of 2 numbers: " + mul); 
        
        scanner.close(); // Closing the scanner to avoid resource leaks
    }
}
output:
Enter first number: 5  
Enter second number: 6

Product of 2 numbers: 30

