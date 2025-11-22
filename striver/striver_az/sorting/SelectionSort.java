package striver.striver_az.sorting;
import java.util.Arrays;

public class SelectionSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findminidx(int arr[], int start, int end) {
        int minidx = 0;
        int minval = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] < minval) {
                minval = arr[i];
                minidx = i;
            }
        }
        return minidx;
    }

    public static void selection_sort(int arr[]) {
        System.out.println("Original Array: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int idx = findminidx(arr, i, arr.length - 1);
            swap(arr, i, idx);
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 11, -1, 24, -52, 20, 9, 0, 2, 2 };
        selection_sort(arr);
    }
}