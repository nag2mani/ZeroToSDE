package striver.striver_az.binarysearch.bs_on_1d;
// work only for distinct elements in an array.
public class RotatedArray1 {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2}; // Exception: 1,0,1,1,1 for target 0 and if you remove = in line 20 then fail for [3,1] target 1
        int target = 0;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target){
        // method-1 : find min in array divide array in two part and run binary search on both part.
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Now check which part is sorted (Gurenteed : one part will be sorted).
            if (arr[first] <=  arr [mid]) {
                // Left part of array is sorted.
                if (target < arr[mid] && arr[first] <= target) {
                    last = mid - 1;
                }else{
                    first = mid + 1;
                }
            } else {
                // Right part of array is sorted.
                if (target > arr[mid] && arr[last] >= target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        return -1;

    }
}
