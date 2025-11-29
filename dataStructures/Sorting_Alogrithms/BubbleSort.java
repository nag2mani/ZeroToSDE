package dataStructures.Sorting_Alogrithms;
import java.util.Arrays;

public class BubbleSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble_sort(int arr[]) {
        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int k = 0; k < arr.length; k++) {
            int i = 0;
            int j = 1;
            while (i < j && j < arr.length) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                i++;
                j++;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void optimised_bubble_sort(int arr[]) {
        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int k = 0; k < arr.length; k++) {
            int noOfSwaps = 0; // If no swap happen in that iteration then break
            int i = 0;
            int j = 1;
            while (i < j && j < arr.length) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    noOfSwaps++;
                }
                i++;
                j++;
            }
            System.out.println(noOfSwaps);
            if (noOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // int[] arr = { 13, 46, 11, -1, 24, -52, 20, 9, 0, 2, 2 };
        int[] arr = { 9, 46, 24, 52, 20, 13 };
        // bubble_sort(arr);
        optimised_bubble_sort(arr);
    }
}