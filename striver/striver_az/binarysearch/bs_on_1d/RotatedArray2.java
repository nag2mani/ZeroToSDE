package striver.striver_az.binarysearch.bs_on_1d;
public class RotatedArray2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1}; // [1,0,1,1,1] true
        int target = 0;
        System.out.println(search2(arr, target));
    }
    public static boolean search2(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                return true;
            }

            if(arr[first] == arr[mid] && arr[mid] == arr[last]){ // when duplicates are there.
                // Shrinking the boundary by 1 on both sides does NOT eliminate the target.
                first++;
                last--;
                continue;
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
        return false;
    }
}