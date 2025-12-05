package striver.striver_az.binarysearch.bs_on_1d;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;
        int[] result = countOccurrences(arr, target);
        System.out.println("Count of occurrences of " + target + ": " + (result[1] - result[0] + 1));
    }

    public static int[] countOccurrences(int[] arr, int target){
        return FirstLastPos.firstLastPos(arr, target);
    }
}