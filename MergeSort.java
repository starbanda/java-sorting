import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take input for array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // make a call to merge sort function
        sol(arr, 0, n - 1);

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Recursive method to implement merge sort
    public static void sol(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle index
            int mid = left + (right - left) / 2;

            // Recursively sort the first half
            sol(arr, left, mid);
            // Recursively sort the second half
            sol(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Method to merge two sorted halves
    private static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of left and right subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays for left and right halves
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to left and right subarrays
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        // Merge the two sorted arrays
        int i = 0, j = 0, k = left;

        // Compare elements of leftArr and rightArr and merge them in sorted order
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy any remaining elements from leftArr
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        // Copy any remaining elements from rightArr
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }
}
