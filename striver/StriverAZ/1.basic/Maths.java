import java.util.ArrayList;
import java.util.Stack;

public class Maths {
    public static void main(String[] args) {
        System.out.println("Learning Basic Maths");
        System.out.println(divide(11, 5));
        System.out.println(numberOfDigits(120));
        reverseNumber(122352);
        System.out.println(checkPalindrome(0123321));
        System.out.println(hcf(4, 10));
        System.out.println(isArmstrong(153));
        System.out.println(allDivisors(12));
        System.out.println(isPrime(103));
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static int numberOfDigits(int n) {
        int digits = 1;
        while (n > 9) {
            n = n / 10;
            digits++;
        }
        return digits;
    }

    // int digits = String.valueOf(Math.abs(n)).length();

    // public static int numberOfDigitsOptimal(int n) {
    //     int n = Math.abs(n);
    //     int digits = 0;
    //     do {
    //         n /= 10;
    //         digits++;
    //     } while (n > 0);
    // }

    public static void reverseNumber(int n) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Initial Number: " + n);
        while (n > 0) {
            int digit = n % 10;
            number.add(digit);
            n = n / 10;
        }
        int index = 0;
        for (int i = 0; i < number.size(); i++) {
            index++;
            if (number.get(i) == 0) {
                continue;
            } else {
                break;
            }
        }
        System.out.print("Reversed Number: ");
        for (int j = index - 1; j < number.size(); j++) {
            System.out.print(number.get(j));
        }
        System.out.println();
    }


    // public static int reverseNumberOptimal(int n) {
    //     int reversed = 0;
    //     while (n > 0) {
    //         reversed = reversed * 10 + n % 10;
    //         n = n / 10;
    //     }
    //     return reversed;
    // }

    public static boolean checkPalindrome(int n) {
        n = Math.abs(n);
        Stack<Integer> stack = new Stack<Integer>();
        int digits = numberOfDigits(n);
        if (digits % 2 == 0) {
            int i = 0;
            while (i < digits / 2) {
                int digit = n % 10;
                stack.push(digit);
                n = n / 10;
                i++;
            }
        } else {
            int i = 0;
            while (i < digits / 2) {
                int digit = n % 10;
                stack.push(digit);
                n = n / 10;
                i++;
            }
            n = n / 10;
        }

        while (!stack.isEmpty()) {
            if (stack.pop() == n % 10) {
                n = n / 10;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    // public static boolean isPalindromeOptimal(int n) {
    //     int original = n;
    //     int reversed = 0;
    //     while (n > 0) {
    //         reversed = reversed * 10 + n % 10;
    //         n = n / 10;
    //     }
    //     return original == reversed;
    // }

    public static int hcf(int a, int b) {
        int gcd = 1;
        int smaller = 1;
        if (a < b) {
            smaller = a;
        } else {
            smaller = b;
        }
        int i = 1;
        while (i <= smaller) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    // Using Euclidean algorithm
    // public static int hcfOptimal(int a, int b) {
    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }
    //     return Math.abs(a);
    // }

    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int digits = numberOfDigits(n);
        int result = 0;
        while (n > 0) {
            result = result + (int) Math.pow(n % 10, digits);
            n = n / 10;
        }
        return result == originalNumber;
    }

    // public static boolean isArmstrongOptimal(int n) {
    //     int originalNumber = n;
    //     int digits = numberOfDigitsOptimal(n);
    //     int result = 0;
    //     while (n > 0) {
    //         result += Math.pow(n % 10, digits);
    //         n /= 10;
    //     }
    //     return result == originalNumber;
    // }

    public static ArrayList<Integer> allDivisors(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                arr.add(i);
            }
            i++;
        }
        return arr;
    }

    // public static ArrayList<Integer> allDivisorsOptimal(int n) {
    //     ArrayList<Integer> arr = new ArrayList<Integer>();
    //     for (int i = 1; i <= Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             arr.add(i);
    //             if (i != n / i) {
    //                 arr.add(n / i);
    //             }
    //         }
    //     }
    //     arr.sort(null);
    //     return arr;
    // }

    public static boolean isPrime(int n) {
        if (allDivisors(n).size() == 2) {
            return true;
        } else {
            return false;
        }
    }

    // public static boolean isPrimeOptimal(int n) {
    //     if (n <= 1)
    //         return false;
    //     if (n == 2)
    //         return true;
    //     if (n % 2 == 0)
    //         return false;
    //     for (int i = 3; i <= Math.sqrt(n); i += 2) {
    //         if (n % i == 0)
    //             return false;
    //     }
    //     return true;
    // }
}
