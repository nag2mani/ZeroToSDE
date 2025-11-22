package striver.striver_az.array.easy;
import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySum {
    public static void main(String[] args) {
        int k = 0;
        int[] arr1 = {6, -1, -3, 4, -2, 2, 4, 6, -12, -2}; // 5
        int[] arr2 = {6, 4, -5, 1, 8, 3, 2, -10, -4, 0, 4, -9}; // 6
        int[] arr3 = {0,0,5,5,0,0, 0}; // 6
        // printallsubarrays(arr1);
        System.out.println("Longest Subarray with given Sum K using Method1 : " + method1(arr1, k) + ", " + method1(arr2, k) + ", " + method1(arr3, k));
        System.out.println("Longest Subarray with given Sum K using Method2 : " + method2(arr1, k) + ", " + method2(arr2, k) + ", " + method2(arr3, k));
        System.out.println("Longest Subarray with given Sum K using Method3 : " + method3(arr1, k) + ", " + method3(arr2, k) + ", " + method3(arr3, k));
    }


    public static void printallsubarrays(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) { //this is printing time so ideally it is taking n^2 time.
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }


    public static int method1(int[] arr, int k){
        // Return the length of longest subarray.
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int len = 0;
                for (int s = i; s < j+1; s++) {
                    sum = sum + arr[s];
                    len = len + 1;
                }
                if (sum==k){
                    if (len>result){
                        result = len;
                    }
                }
            }
        }
        return result;
    }


    public static int method2(int[] arr, int k){
        // Return the length of longest subarray.
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int len = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                len = len + 1;
                if (sum==k){
                    if (len>result){
                        result = len;
                    }
                }
            }
        }
        return result;
    }


    public static int method3(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        // prefix sum 0 occurs before array starts at index -1
        map.put(0, -1);

        int prefix_sum = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];
            // if there exists a prefix with sum = prefix_sum - k, then subarray (map.get(...) + 1 .. i) sums to k
            if (map.containsKey(prefix_sum - k)) {
                int len = i - map.get(prefix_sum - k);
                if (len > result) result = len;
            }
            if (!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i); // store earliest index for this prefix_sum
            }
        }
        return result;
    }
}