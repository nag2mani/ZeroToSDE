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
    public static int findMissingNumberXOR(int[] arr, int n) {
        int xor1 = 0;
        int xor2 = 0;
        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor1 ^= arr[i];
        }
        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor2 ^= i;
        }
        // Missing number is xor1 ^ xor2
        return xor1 ^ xor2;
    }
}
