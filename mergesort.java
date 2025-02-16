public class MergeSort {

    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    static void divide(int[] arr, int start_index, int end_index) {
        if (start_index >= end_index) {
            return;
        }

        int mid = start_index + (end_index - start_index) / 2;

        divide(arr, start_index, mid);
        divide(arr, mid + 1, end_index);

        conquer(arr, start_index, mid, end_index);
    }

    static void conquer(int[] arr, int start_index, int mid, int end_index) {
        int[] merged_array = new int[end_index - start_index + 1];

        //indices
        int x = 0; //tracks the merged array
        int index1 = start_index; //tracks the first half of array
        int index2 = mid + 1; //tracks the second half of array

        while (index1 <= mid && index2 <= end_index) {
            if (arr[index1] <= arr[index2]) {
                merged_array[x] = arr[index1];
                x++; //to move the pointer of merged_array
                index1++; //element has been added from array1
            } else {
                merged_array[x] = arr[index2];
                x++;
                index2++;
            }
        }

        while (index1 <= mid) { //in case elements remain in array 1 when elements of array 2 have been exhausted
            merged_array[x] = arr[index1];
            x++;
            index1++;
        }

        while (index2 <= end_index) { //in case elements remain in array 2 when elements of array 1 have been exhausted
            merged_array[x] = arr[index2];
            x++;
            index2++;
        }

        //copying the merged_array into original array
        int j = start_index;
        for (int i = 0; i < merged_array.length; i++) {
            arr[j] = merged_array[i];
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        int n = arr.length;
        divide(arr, 0, n - 1);
        // Sort the array
        printArray(arr); // Print the sorted array
    }
}
