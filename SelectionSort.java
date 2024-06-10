import java.util.*;

public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {5, 3, 4, 2, 1};
        selectionsort(arr);
        printArr(arr);
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // Fixed loop condition
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) { // Fixed loop condition
                if (arr[j] < arr[minpos]) { // Fixed comparison to find the minimum element
                    minpos = j;
                }
            }
            // Swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

