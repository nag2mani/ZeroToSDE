import java.util.Arrays;

    // Given an array consisting of only 0s, 1s, and 2s. Write a program to in-place
    // sort the array without using inbuilt sort functions.
    // ( Expected: Single pass-O(N) and constant space)


//   The Dutch National Flag algorithm is NOT stable - it does not preserve the relative order of equal elements or elements within the same partition. It's designed for efficiency (O(N) time, O(1) space) but sacrifices stability. If you need to preserve order, you would need a different algorithm (like counting sort or a stable partitioningalgorithm), which typically requires O(N) extra space.
public class SortArray012 {
    public static void main(String[] args) {
        System.out.println("=== Method 1: Sort 0, 1, 2 ===");
        int[] arr1 = {0, 1, 2, 0, 1, 2, 0, 1, 1, 2, 0, 0, 1, 2, 0};
        System.out.println("Before: " + Arrays.toString(arr1));
        method1_sorting012(arr1);
        System.out.println("After:  " + Arrays.toString(arr1));

        System.out.println("\n=== Method 2: Dutch National Flag (Multiple Pivots) ===");
        
        // Test with pivot = 5
        int[] arr2 = {11,3,5,2,15,9,1,4,5,7,5,8,5,2};
        System.out.println("\nTest 1 - Pivot = 5:");
        System.out.println("Before: " + Arrays.toString(arr2));
        method2_sorting012(arr2, 5);
        System.out.println("After:  " + Arrays.toString(arr2));
        
        // Test with pivot = 7
        int[] arr3 = {11,3,5,2,15,9,1,4,5,7,5,8,5,2};
        System.out.println("\nTest 2 - Pivot = 7:");
        System.out.println("Before: " + Arrays.toString(arr3));
        method2_sorting012(arr3, 7);
        System.out.println("After:  " + Arrays.toString(arr3));
        
        // Test with pivot = 10
        int[] arr4 = {11,3,5,2,15,9,1,4,5,7,5,8,5,2};
        System.out.println("\nTest 3 - Pivot = 10:");
        System.out.println("Before: " + Arrays.toString(arr4));
        method2_sorting012(arr4, 10);
        System.out.println("After:  " + Arrays.toString(arr4));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void method1_sorting012(int[] arr) { // True single pass O(N) time and O(1) space
        int low = 0; // all elements before low are 0s
        int i = 0;
        int high = arr.length - 1; // all elements after high are 2s

        while (i <= high) {
            if (arr[i] == 0) {
                swap(arr, low, i);
                low++;
                i++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, high);
                high--;
            }
        }
    }

    public static void method2_sorting012(int[] arr, int pivot) { // Generalized approach: Dutch National Flag Algorithm.
        int low = 0; // elements before low are < pivot
        int i = 0;
        int high = arr.length - 1; // elements after high are > pivot
        
        while (i <= high) {
            if (arr[i] < pivot) {
                swap(arr, i, low);
                low++;
                i++;
            } else if (arr[i] == pivot) {
                i++;
            } else {
                swap(arr, i, high);
                high--;
            }
        }
    }
}