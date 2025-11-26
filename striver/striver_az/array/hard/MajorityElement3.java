import java.util.*;
public class MajorityElement3 {
    // Return an element that occurs more than N/2 times in the given array.
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1, 1, 1, 2, 2};
        int[] arr2 = {4,4,2,4,3,4,4,3,2,4};
        List<Integer> majorityElement = method1_majorityElement(arr1);
        System.out.println("Majority Element: " + majorityElement);

        List<Integer> majorityElement1 = method2_findMajorityElement(arr2);
        System.out.println("Majority Element: " + majorityElement1);

        List<Integer> method3_majorityNby = method3_majorityNby3(arr2);
        System.out.println("Majority Element: " + method3_majorityNby);
    }


    public static List<Integer> method1_majorityElement(int[] arr) {
        List<Integer> res = new ArrayList<>();
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
        if (max_count > arr.length/3){res.add(max_ele);}
        int max_ele2 = arr[0];
        int max_count2 = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max_count2 && entry.getKey() != max_ele){
                max_count2 = entry.getValue();
                max_ele2 = entry.getKey();
            }
        }
        if (max_ele != max_ele2 && max_count2 > arr.length/3){res.add(max_ele2);}
        return res;
    }


    public static List<Integer> method2_findMajorityElement(int[] arr){ // same as method1
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        int limit = arr.length / 3;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > limit) {
                result.add(entry.getKey());
            }
        }

        return result;
    }


    public static List<Integer> method3_majorityNby3(int[] arr) {
        int count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;

        // Phase 1: Find potential candidates
        for (int num : arr) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify candidates
        count1 = 0; count2 = 0;
        for (int num : arr) {
            if (num == cand1) count1++;
            else if (num == cand2) count2++;
        }

        List<Integer> res = new ArrayList<>();
        int limit = arr.length / 3;

        if (count1 > limit) res.add(cand1);
        if (cand2 != null && count2 > limit) res.add(cand2);

        return res;
    }

}