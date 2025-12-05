package striver.striver_az.binarysearch.bs_on_1d;
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3}; //1
        int target = 2;
        int[] arr1 = {3,5,8,15,19}; //3
        int target1 = 9;
        System.out.println(insert_pos(arr1, target1));
    }

    public static int insert_pos(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;
        int ans = arr.length;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target){
                ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }
}