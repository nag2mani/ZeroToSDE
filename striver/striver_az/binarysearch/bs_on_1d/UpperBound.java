package striver.striver_az.binarysearch.bs_on_1d;

public class UpperBound {
    // finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.
    public static void main(String[] args) {
        int[] arr = {1,2,2,3}; //1
        int target = 2;
        int[] arr1 = {3,5,8,9,15,19}; //3
        int target1 = 9;
        System.out.println(upper_bound(arr, target));
    }

    public static int upper_bound(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int ans = arr.length;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] > target) {
                ans = mid; // automatically it will converge to min index
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }
}
