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
        System.out.println("Multiplication ofOUTPUT the matrix:");
        int sub[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sub[i][j] = arr1[i][j] - arr2[i][j];
                System.out.println(sub[i][j] + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the arr1:
2 3
6 7
Enter the arr2:
2 5
5 6

Multiplication of the matrix:
0 
-2 

1 
1 


Process finished with exit code 0

