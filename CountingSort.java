import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take input for student ages
        System.out.println("Enter the ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 10 || arr[i] > 18) {
                System.out.println("Invalid age! Please enter values between 10 and 18.");
                return;
            }
        }

        // Call Counting Sort function
        countingSort(arr, n);

        // Print the sorted ages
        System.out.println("Sorted Student Ages:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Counting Sort Algorithm
    public static void countingSort(int[] arr, int n) {
        int minAge = 10, maxAge = 18;

        // 9 possible ages (10 to 18)
        int range = maxAge - minAge + 1;

        // Frequency array
        int[] count = new int[range];

        // Output array for sorted ages
        int[] output = new int[n];

        // Step 1: Count the occurrences of each age
        for (int i = 0; i < n; i++) {
            count[arr[i] - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - minAge] - 1] = arr[i];
            count[arr[i] - minAge]--;
        }

        // Copy sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, n);
    }
}
