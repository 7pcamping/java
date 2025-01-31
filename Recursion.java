public class Recursion1 {
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    public static void main(String[] args) {
        int n= 1;
        printNum(n);
    }
}
OUTPUT:
1
2
3
4
5

Process finished with exit code 0
