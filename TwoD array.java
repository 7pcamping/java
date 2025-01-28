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
        System.out.println("sum of the matrix:");
        int sum[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = arr1[i][j] * arr2[i][j];
                System.out.println(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the arr1:
3 4
3 4
Enter the arr2:
5 6
7 9

sum of the matrix:
15 
24 

21 
28 


Process finished with exit code 0



