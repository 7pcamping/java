public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        // Assign values to the array
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        // Print the array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}

OUTPUT:
Element at index 0: 5
Element at index 1: 10
Element at index 2: 15
Element at index 3: 20
Element at index 4: 25

