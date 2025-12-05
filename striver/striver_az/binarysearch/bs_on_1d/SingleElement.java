package striver.striver_az.binarysearch.bs_on_1d;

public class SingleElement {
    // You are given a sorted array consisting of only integers where every element appears exactly twice,
    // except for one element which appears exactly once.
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int mid = first + (last - first) / 2;
            // Ensure we are at the start of a pair
            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                first = mid + 2;
            } else {
                last = mid;
            }
        }
        return arr[first];
    }
}
