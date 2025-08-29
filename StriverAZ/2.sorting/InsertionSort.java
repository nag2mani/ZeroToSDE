import java.util.Arrays;

public class InsertionSort {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int insertion_pos(int[] arr, int idx){
        int result = idx;
        for (int i = idx-1; i >=0;i--){
            if (arr[i] > arr[idx]){
                result = i;
            }else{
                break; // because if it is greater than first element then it must be greater than previous elements.
            }
        }
        return result;
    }

    public static void insertion_sort(int[] arr){
        for (int i=1; i<arr.length;i++){
            int pos = insertion_pos(arr, i);
            int j = i;
            while (j>pos) {
                swap(arr, j, j-1);
                j--;
            }
        }
    }

    public static void recursive_insertion_sort(int[] arr, int k, int n){
        if (k==n){
            return;
        }
        int i = k;
            int pos = insertion_pos(arr, i);
            int j = i;
            while (j>pos) {
                swap(arr, j, j-1);
                j--;
            }
        recursive_insertion_sort(arr,k+1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 11, -1, 24, -52, 20, 9, 0, 2, 2 };
        // int[] arr = { 9, 46, 24, 52, 20, 13 };
        int n = arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));
        // insertion_sort(arr);
        recursive_insertion_sort(arr, 1, n);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
