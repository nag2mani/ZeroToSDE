public class NthRoot {

    public static void main(String[] args) {
        int num = 81;
        int n = 4;
        System.out.println(nthRoot(num, n));
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