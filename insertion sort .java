public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        //insertion sort;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];//current element
            int j = i - 1; //sorted part of the last element
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

               //placement
            arr[j + 1] = current;

        }
        printArray(arr);

    }
}
