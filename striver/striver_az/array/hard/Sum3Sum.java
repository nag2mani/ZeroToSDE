package striver.striver_az.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 0;

        System.out.println("Triplets with target sum: " + threeSum(arr, target));
        // Expected Output: [[-1,-1,2], [-1,0,1]]
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicate left values
                    while (l < r && nums[l] == nums[l + 1]) l++;

                    // Skip duplicate right values
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }
            }
        }
        return result;
    }
}
