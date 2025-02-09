import java.util.Arrays;

public class BinarySearchExample {
    // Binary Search function
    public static int binarySearch(int arr[], int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2; 

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91}; // Sorted array
        int target = 23; // Element to search

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result == -1)
            System.out.println("Element not found in the array.");
        else
            System.out.println("Element " + target + " found at index " + result);
    }
}
OUTPUT:
Element 23 found at index 5;
