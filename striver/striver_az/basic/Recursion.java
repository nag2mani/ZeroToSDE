import java.util.*;

public class Recursion {
    // Recursion, Stack Overflow in Recursion and Base Condition.
    public static void main(String[] args) {
        printingNameNtimes(5);
        printingNumberfrom1(1, 6);
        printingNumberfromN(5);
        System.out.println("Sum : " + sumOfFirstN(10));
        int[] arr = {5,4,3,2,1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-1);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
        System.out.println("palindrome : " + checkPalindrome("madam", 0));
        System.out.println("Factorial : " + factorialOfFirstN(5));
        fibonacci(20);
    }

    public static void printingNameNtimes(int n) {
        System.out.println("Nagmani Kumar");
        if (n>=1){
            printingNameNtimes(n-1);
        }
    }

    public static void printingNumberfrom1(int k, int n) {
        System.out.println(k);
        if (k<n){
            printingNumberfrom1(k+1, n);
        }
    }

    public static void printingNumberfromN(int n) {
        System.out.println(n);
        if (n>1){
            printingNumberfromN(n-1);
        }
    }

    public static int sumOfFirstN(int n){
        if (n==0){return 0;}
        return n + sumOfFirstN(n-1);
    }

    public static int factorialOfFirstN(int n){
        if (n==1){return 1;}
        return n * factorialOfFirstN(n-1);
    }

   //(Need to revise)
   static void reverseArray(int arr[], int start, int end) {
      if (start < end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
         reverseArray(arr, start + 1, end - 1);
      }
   }

   //(Need to revise)
    public static boolean checkPalindrome(String str, int i) {
        if (i >= str.length()/2){return true;}
        if (str.charAt(i) != str.charAt(str.length() - i - 1)){ return false;}
        return checkPalindrome(str, i+1);
    }

    public static int fibonacciHelper(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else{
            return fibonacciHelper(n-1) + fibonacciHelper(n-2);
        }
    }

    public static void fibonacci(int n) {
        for (int i=0; i<=n;i++){
            System.out.print(fibonacciHelper(i) + " ");
        }
        System.out.println();
    }

}