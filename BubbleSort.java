import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sol(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sol(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}


/*
I/P ->
6
4 2 1 3 5 6

O/P -> 1 2 3 4 5 6
 */