package striver.striver_az.array.medium;
// A Leader is an element that is greater than all of the elements on its right side in the array.

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 0}; // Output: 7, 1, 0
        int[] arr1 = {10, 22, 12, 3, 0, 6}; // Output: 22, 12, 6
        Leader(arr1); // print in same order
        LeaderOptimal(arr1); // print in opp order
    }

    public static void Leader(int[] arr){
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = i+1;
            while (j<n) {
                if (arr[i] > arr[j]){
                    if (j == n-1){
                        System.out.println(arr[i]);
                    }
                } else {
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println(arr[n-1]);
    }

    public static void LeaderOptimal(int[] arr){
        // print in opp order
        int n = arr.length;
        int back = n-1;
        System.out.println(arr[back]);
        int max = arr[back];
        while (back > 0) {
            if (arr[back-1] > max) {
                System.out.println(arr[back-1]);
                max = arr[back-1];
            }
            back--;
        }
    }
}