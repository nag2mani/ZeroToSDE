import java.util.*;
public class MajorityElement {
    // Return an element that occurs more than N/2 times in the given array.
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = {4,4,2,4,3,4,4,3,2,4};
        int majorityElement = method1_findMajorityElement(arr1);
        System.out.println("Majority Element: " + majorityElement);

        int majorityElement1 = method2_findMajorityElement(arr2);
        System.out.println("Majority Element: " + majorityElement1);
    }

    public static int method1_findMajorityElement(int[] arr){
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        int max_ele = arr[0];
        int max_count = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max_count){
                max_count = entry.getValue();
                max_ele = entry.getKey();
            }
        }
        return max_ele;
    }

    public static int method2_findMajorityElement(int[] arr){
        // Boyer-Moore majority vote algorithm
        // Phase 1: find a candidate
        Integer candidate = null;
        int count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: (optional) verify candidate is actually majority
        int freq = 0;
        if (candidate != null) {
            for (int num : arr) {
                if (num == candidate) freq++;
            }
            if (freq > arr.length / 2) return candidate;
        }

        // If no majority exists, return -1 (problem often assumes majority exists)
        return -1;
    }
}