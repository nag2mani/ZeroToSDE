public class NthRoot {

    public static void main(String[] args) {
        int[] testCases = {0, 1, 2, 4, 8, 9, 15, 16, 17, 18, 19, 20, 21, 25};
        int n = 2;
        for (int num : testCases) {
            System.out.println("nthroot(" + num + ") = " + nthRoot(num, n));
        }
    }

    public static int nthRoot(int number, int n) {
        int low = 1, high = number;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long result = 1;

            for (int i = 0; i < n; i++) {
                result *= mid;
                if (result > number) break;
            }

            if (result == number) {
                return mid;
            } else if (result > number) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
