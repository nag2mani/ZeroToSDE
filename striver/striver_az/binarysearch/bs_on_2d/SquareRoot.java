package striver.striver_az.binarysearch.bs_on_2d;
// You are given a positive integer n. Your task is to find and return its square root.
// If ‘n’ is not a perfect square, then return the floor value of sqrt(n).
public class SquareRoot {
    public static void main(String[] args) {
    int[] testCases = {0, 1, 2, 4, 8, 9, 15, 16, 17, 25};

    for (int num : testCases) {
        System.out.println("sqrt(" + num + ") = " + sqrt(num));
    }
    }

    public static int sqrt(int number) {
        int first = 1;
        int last = number/2;
        int ans = 0; // we need ans in every case thayt's why initialized.
        if (number < 2) return number;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid*mid <= number) {
                ans=mid;
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return ans;
    }
}
