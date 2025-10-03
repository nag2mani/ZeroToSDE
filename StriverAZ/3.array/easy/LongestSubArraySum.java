public class LongestSubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int target = 10;
        printallsubarrays(arr);
        // System.out.println("Length of longest subarray with sum 0 is: " + findLongestSubarraySum(arr, target));
    }

    public static void printallsubarrays(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int findLongestSubarraySum(int[] arr, int target){
        return 4;
    }
}