package striver.striver_az.binarysearch.bs_on_1d;

public class FirstLastPos {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        int[] result = firstLastPos(arr, target);
        System.out.println("First Position: " + result[0] + ", Last Position: " + result[1]);
    }

    public static int[] firstLastPos(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int firstPos = -1;
        int lastPos = -1;

        // Find first position
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                firstPos = mid;
                last = mid - 1;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        // Reset for finding last position
        first = 0;
        last = arr.length - 1;

        // Find last position
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                lastPos = mid;
                first = mid + 1;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return new int[]{firstPos, lastPos};
    }
}
