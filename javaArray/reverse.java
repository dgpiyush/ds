package ArrayClass;
import java.util.Scanner;


class reverse {
    static void rvereseArray(int arr[], int start, int end) {
        int temp;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*
     * Utility that prints out an array on a line
     */
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        Scanner inputObj = new Scanner(System.in);
        System.out.println("How many element yOu want in the array");
        int n = inputObj.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.printf("Enter %d th Element\t", i);
            arr[i] = inputObj.nextInt();
        }
    

        // arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("\nYour Array is");
        printArray(arr, n);
        rvereseArray(arr, 0, n - 1);
        System.out.println("\nReversed array is");
        printArray(arr, n);

    }
}