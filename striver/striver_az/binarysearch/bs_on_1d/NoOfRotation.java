package striver.striver_az.binarysearch.bs_on_1d;

public class NoOfRotation {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(countRotations(arr));
    }
    public static int countRotations(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int idx = 0;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            // Check if the mid element is the minimum
            if (arr[mid] >= arr[first]) {
                // Left part is sorted, so the minimum must be in the right part
                if (ans > arr[first]) {
                    idx = first;
                    ans = arr[first];
                }
                first = mid + 1;
            } else {
                // Right part is sorted, so the minimum must be in the left part
                if (ans > arr[mid]) {
                    idx = mid;
                    ans = arr[mid];
                }
                last = mid - 1;
            }
        }
        return idx;
    }
}
