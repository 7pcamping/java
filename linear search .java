public class LinearSearch {
    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if key is not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 10};
        int key = 8;

        int result = linearSearch(arr, key);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
