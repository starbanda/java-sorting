import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take input for students' exam scores
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function to implement selection sort
        sol(arr, n);

        // Print the sorted scores
        System.out.println("Sorted Exam Scores:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Selection Sort Algorithm
    public static void sol(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element is the minimum
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    // Update minIndex if a smaller element is found
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
