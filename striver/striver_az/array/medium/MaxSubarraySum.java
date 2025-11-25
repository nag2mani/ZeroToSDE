package striver.striver_az.array.medium;
public class MaxSubarraySum {
    // find the contiguous subarray (containing at least one number) which has the largest sum.
    // returns its sum and prints the subarray.
    public static void main(String[] args) {
        int[] arr = {-1};
        int maxSum = method1_maxSubarraySum(arr);
        int maxSum1 = method2_maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum); 
        System.out.println("Maximum Subarray Sum1: " + maxSum1); 
    }

    public static int method1_maxSubarraySum(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        for (int i=0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                int len = 0;
                for (int s = i; s < j+1; s++) {
                    sum = sum + arr[s];
                    len = len + 1;
                }
                if (sum > maxsum){
                    maxsum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        // printArray(arr, startIndex, endIndex);
        return maxsum;
    }

    public static int method2_maxSubarraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr_sub_sum = 0;
        for (int i : arr) {
            curr_sub_sum = Math.max(i, i+curr_sub_sum);
            max = Math.max(max, curr_sub_sum);
        }
        return max;
    }

}
