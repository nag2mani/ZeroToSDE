public class LongestSubArraySumTest { // FIRST NEED TO COMPILE THIS FILE.
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        // Test cases: array, k, expected
        int[] arr1 = {6, -1, -3, 4, -2, 2, 4, 6, -12, -2}; // expected 7 for k=0
        int[] arr2 = {6, 4, -5, 1, 8, 3, 2, -10, -4, 0, 4, -9}; // expected 12 for k=0
        int[] arr3 = {0,0,5,5,0,0,0}; // expected 3 for k=0

        // edge cases
        int[] empty = {};
        int[] singleZero = {0};
        int[] singleNonZero = {5};
        int[] negatives = {-1, -2, -3, -4};

        // run tests
        passed += runCase(arr1, 0, 7) ? 1 : 0;
        passed += runCase(arr2, 0, 12) ? 1 : 0;
        passed += runCase(arr3, 0, 3) ? 1 : 0;

        // edge expectations
        passed += runCase(empty, 0, 0) ? 1 : 0; // no subarray
        passed += runCase(singleZero, 0, 1) ? 1 : 0;
        passed += runCase(singleNonZero, 5, 1) ? 1 : 0;
        passed += runCase(negatives, -6, 3) ? 1 : 0; // -1 + -2 + -3 = -6 (length 3)

        // compute totals (we used passed increment; derive failed count)
        int total = 7; // number of test cases executed
        failed = total - passed;

        System.out.println();
        System.out.println("Test summary: " + passed + " passed, " + failed + " failed (" + total + " total)");

        if (failed > 0) {
            System.exit(1);
        }
    }

    private static boolean runCase(int[] arr, int k, int expected) {
        int r1 = LongestSubArraySum.method1(arr, k);
        int r2 = LongestSubArraySum.method2(arr, k);
        int r3 = LongestSubArraySum.method3(arr, k);

        boolean ok = (r1 == expected) && (r2 == expected) && (r3 == expected);
        String status = ok ? "PASS" : "FAIL";
        System.out.println("Case k=" + k + ", arr(len=" + arr.length + "): " + status + " => method1=" + r1 + ", method2=" + r2 + ", method3=" + r3 + ", expected=" + expected);
        return ok;
    }
}
