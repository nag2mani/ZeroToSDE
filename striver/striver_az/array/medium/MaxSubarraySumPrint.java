package striver.striver_az.array.medium;
public class MaxSubarraySum {
    // find the contiguous subarray (containing at least one number) which has the largest sum.
    // returns its sum and prints the subarray.
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = method1_maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum); 
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
        printArray(arr, startIndex, endIndex);
        return maxsum;
    }

    public static void printArray(int[] arr, int start, int end) {
        System.out.print("Subarray with max sum: [");
        for (int k = start; k < end+1; k++) {
            System.out.print(arr[k]);
            if (k < end) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static int method2_maxSubarraySum(int[] arr) {
        // Above method is TLE. Leetcode 53
    }

}
