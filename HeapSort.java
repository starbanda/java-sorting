import java.util.Scanner;

public class HeapSort {
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

        // Call function to implement heap sort
        sol(arr, n);

        // Print the sorted scores
        System.out.println("Sorted Exam Scores:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // Method to implement heap sort
    public static void sol(int[] arr, int n) {
        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from the heap
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (max element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Reheapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify function to maintain max heap property
    public static void heapify(int[] arr, int n, int i) {
        // Assume root is the largest
        int largest = i;

        // Left child
        int left = 2 * i + 1;

        // Right child
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }
}
