package striver.striver_az.binarysearch;

public class LowerBound {
    // finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. target.
    public static void main(String[] args) {
        int[] arr = {1,2,2,3}; //1
        int target = 2;
        int[] arr1 = {3,5,8,15,19}; //3
        int target1 = 9;
        System.out.println(lower_bound(arr1, target1));
    }

    public static int lower_bound(int[] arr, int target){
        // int idx = BinarySearch.binary_search(arr, target);
        int first = 0;
        int last = arr.length - 1;
        int ans = arr.length; // for very big outside.

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] >= target) {
                ans = mid; // automatically it will converge to min index
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }
}
