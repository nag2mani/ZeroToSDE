package striver.striver_az.binarysearch.bs_on_1d;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,3,20,4,1,0,5};
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr){
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // Peak element is in the right half
                first = mid + 1;
            } else {
                // Peak element is in the left half (including mid)
                last = mid;
            }
        }
        return first;
    }
}
