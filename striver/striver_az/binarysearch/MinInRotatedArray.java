package striver.striver_az.binarysearch;

public class MinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            // Check if the mid element is the minimum
            if (arr[mid] >= arr[first]) {
                // Left part is sorted, so the minimum must be in the right part
                ans = Math.min(ans, arr[first]);
                first = mid + 1;
            } else {
                // Right part is sorted, so the minimum must be in the left part
                ans = Math.min(ans, arr[mid]);
                last = mid - 1;
            }
        }
        return ans;
    }
}