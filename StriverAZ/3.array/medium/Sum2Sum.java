import java.util.ArrayList;
import java.util.HashMap;
public class Sum2Sum {
    public static void main(String[] args) {
        int target1 = 14;
        int[] arr1 = {2,6,5,8,11}; // 14
        int target2 = -7;
        int[] arr2 = {6, 4, -5, 1, 8, 3, 2, -10, -4, 0, 4, -9}; // -7
        int target3 = 15;
        int[] arr3 = {2,6,5,8,11}; // 15
        // printallsubarrays(arr1);
        System.out.println("Two Sum using Brute Force (Method1): " + method1(arr1, target1) + ", " + method1(arr2, target2) + ", " + method1(arr3, target3));
        System.out.println("Two Sum using Binary Search (Method2): " + method2(arr1, target1) + ", " + method2(arr2, target2) + ", " + method2(arr3, target3));
        System.out.println("Two Sum using Two Pointers (Method3): " + method3(arr1, target1) + ", " + method3(arr2, target2) + ", " + method3(arr3, target3));
    }

    public static ArrayList<Integer> method1(int[] arr, int target){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        if (result.size()==0){
            result.add(-1);
            result.add(-1);
        }
        return result;
    }

    public static ArrayList<Integer> method2(int[] arr, int target){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (binarySearch(arr, target - arr[i]) == -1 ){
                continue;
            } else{
                result.add(i);
                result.add(binarySearch(arr, target - arr[i]));
            }
        }
        if (result.size()==0){
            result.add(-1);
            result.add(-1);
        }
        return result;
    }

    public static int[] method3(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static int binarySearch(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == val) {
                return mid;
            }
            if (arr[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}