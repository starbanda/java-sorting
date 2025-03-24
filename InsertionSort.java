import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Take user input for number of elements of array and then enter the elements
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call to sol method for insertion sorting
        sol(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //Method to implement insertion sort
    public static void sol(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
