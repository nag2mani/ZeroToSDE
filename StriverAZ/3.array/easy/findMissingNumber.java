public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7, 8, 9};
        int n = arr.length + 1;
        int actualSum = n*(n+1)/2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.err.println(actualSum-sum);
    }
}
