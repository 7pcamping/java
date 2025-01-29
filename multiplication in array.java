import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int arr1[][] = new int[2][2];
        System.out.println("Enter the arr1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        int arr2[][] = new int[2][2];
        System.out.println("Enter the arr2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Multiplication of the matrix:");
        int mul[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mul[i][j] = arr1[i][j] * arr2[i][j];
                System.out.println(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the arr1:
3 4
7 2
Enter the arr2:
1 2
3 4

Multiplication of the matrix:
3 
8 

21 
8 


Process finished with exit code 0
