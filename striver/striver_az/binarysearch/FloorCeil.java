package striver.striver_az.binarysearch;

public class FloorCeil {
    // Find the floor and ceiling of x.
    // floor of x : largest element <= x
    // ceiling of x : smallest element >= x (lower bound)

    public static void main(String[] args) {
        // int[] arr = {3, 4, 4, 7, 8, 10}; // target = 5 floor = 4 ceil = 7
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 8;
        int[] result = floorCeil(arr, target);
        System.out.println("Floor: " + result[0] + ", Ceil: " + result[1]);
    }

    public static int[] floorCeil(int[] arr, int target){
        int[] result = {target, LowerBound.lower_bound(arr, target)}; // first compile then use function in java inside package.
        int first = 0;
        int last = arr.length - 1;
        int ans = arr.length;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                ans = mid;
                result[0] = ans;
                return result;
            } else if (arr[mid] > target) {
                last = mid - 1;
            } else {
                ans = mid;
                first = mid + 1;
            }
        }
        result[0] = ans;
        return result;
    }
}
