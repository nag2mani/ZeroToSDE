package striver.striver_az.array.easy;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        int k = 0;
        int[] arr1 = {6, -1, -3, 4, -2, 2, 4, 6, -12, -2}; // 5
        int[] arr2 = {6, 4, -5, 1, 8, 3, 2, -10, -4, 0, 4, -9}; // 6
        int[] arr3 = {0,0,5,5,0,0, 0}; // 6
        System.out.println("Total No. of Subarray Method1 : " + method1(arr1, k) + ", " + method1(arr2, k) + ", " + method1(arr3, k));
        System.out.println("Total No. of Subarray Method2 : " + method2(arr1, k) + ", " + method2(arr2, k) + ", " + method2(arr3, k));
        System.out.println("Total No. of Subarray Method3 : " + method3(arr1, k) + ", " + method3(arr2, k) + ", " + method3(arr3, k));
    }

    public static int method1(int[] arr, int k){
        // Return total number of subarray whose sum is k. (IN n^3)
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int s = i; s < j+1; s++) {
                    sum = sum + arr[s];
                }
                if (sum==k){
                    total++;
                }
            }
        }
        return total;
    }

    public static int method2(int[] arr, int k){
        // Return total number of subarray whose sum is k. ( IN n^2)
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum==k){
                    total++;
                }
            }
        }
        return total;
    }

    public static int method3(int[] arr, int k){
        // Return total number of subarray whose sum is k. ( IN n using prefixSum and map)
        int total = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix_sum = prefix_sum + arr[i];
            int v = map.getOrDefault(prefix_sum, 0);
            if (v==0){
                map.put(prefix_sum, 1);
            } else {
                total = total + v;
                map.put(prefix_sum, v+1);
            }
        }
        return total;
    }
}
