package dataStructures.Sorting_Alogrithms;
import java.util.Arrays;

public class QuickSort {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int start, int end) {
        // int pivot = start;
        while (start < end) {
            if (arr[start+1] >= arr[start]){
                swap(arr, start+1, end);
                end--;
            }else{
                swap(arr, start+1, start);
                start++;
            }
        }
        return start;
    }

    public static void quick_sort(int arr[], int start, int end) {
        if (end - start < 1){
            return;
        }else{
            int pivot = partition(arr, start, end);
            quick_sort(arr, start, pivot-1);
            quick_sort(arr, pivot+1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 11, -1, 24, -52, 20, 9, 0, 2, 2 };
        // int[] arr = {29,10,14,37,13};
        System.out.println("Original Array: " + Arrays.toString(arr));
        quick_sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}