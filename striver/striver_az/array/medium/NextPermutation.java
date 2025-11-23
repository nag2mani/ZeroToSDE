package striver.striver_az.array.medium;
import striver.striver_az.sorting.QuickSort;

public class NextPermutation {
    // next permutation of an array of integers is the next lexicographically greater permutation of its integer.
    //  If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        int[] arr = {1,2,3,5,4,2};
        NextPermutations(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void NextPermutations(int[] arr){
        // finding rightmost peak
        int n = arr.length;
        int rmost_peak = -1;
        int i=1;
        while (i < n) {
            if (arr[i-1] < arr[i]){
                rmost_peak = i;
            }
            i++;
        }
        
        // if rmost_peak == -1 means arr is desc so return asc
        if (rmost_peak == -1) {
            for (int j = 0; j < n/2; j++) {
                swap(arr, j, n-j-1);
            }
            return;
        }

        // find element in the range right to the rmost_peak which can be swapped with rightmost - 1. (Special case)
        int k = rmost_peak;
        int newrightmost= rmost_peak;
        for (int m = k+1; m < arr.length; m++) {
            if (arr[m] > arr[rmost_peak-1] && arr[m] < arr[rmost_peak]) {
                newrightmost = m;
            }
        }
        swap(arr, rmost_peak-1, newrightmost);
        QuickSort.quick_sort(arr, rmost_peak, n-1);
    }
}
