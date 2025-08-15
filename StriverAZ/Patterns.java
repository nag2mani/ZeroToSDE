import java.util.ArrayList;

public class Patterns {
        public static void main(String[] args) {

                String arr[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
                int n = 9;

                System.out.println("Pattern: 1 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 2 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                System.out.println("Pattern: 3 -----------------------------");

                for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 4 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 5 -----------------------------");

                for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(j);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 6 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(i);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 7 -----------------------------");

                for (int i = 0; i < n; i++) {
                        // for space
                        for (int j = 0; j < (n - i - 1); j++) {
                                System.out.print(" ");
                        }

                        // for star
                        for (int k = 0; k < (2 * i + 1); k++) {
                                System.out.print("*");
                        }

                        // //for space(iski jarurt nahi hai)
                        // for (int l=0; l< (n-i-1); l++ ) {
                        // System.out.print(" ");
                        // }
                        System.out.println();
                }

                System.out.println("Pattern: 8 -----------------------------");

                for (int i = n - 1; i >= 0; i--) {
                        // for space
                        for (int j = 0; j < (n - i - 1); j++) {
                                System.out.print(" ");
                        }
                        // for star
                        for (int k = 0; k < (2 * i + 1); k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 9 -----------------------------");

                for (int i = 0; i < n; i++) {
                        // for space
                        for (int j = 0; j < (n - i - 1); j++) {
                                System.out.print(" ");
                        }

                        // for star
                        for (int k = 0; k < (2 * i + 1); k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                for (int i = n - 1; i >= 0; i--) {
                        // for space
                        for (int j = 0; j < (n - i - 1); j++) {
                                System.out.print(" ");
                        }
                        // for star
                        for (int k = 0; k < (2 * i + 1); k++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 10 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 11 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        int x = i;
                        for (int j = 1; j <= i; j++) {
                                System.out.print(x % 2);
                                x = x + 1;
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 12 -----------------------------");

                for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(j);
                        }
                        for (int k = 1; k <= 2 * (n - i); k++) {
                                System.out.print(" ");
                        }
                        for (int l = i; l > 0; l--) {
                                System.out.print(l);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 13 -----------------------------");

                int count = 1;
                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(count + " ");
                                count++;
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 14 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(arr[j - 1]);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 15 -----------------------------");

                for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(arr[j - 1]);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 16 -----------------------------");

                for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                                System.out.print(arr[i - 1]);
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 17 -----------------------------");

                for (int i = 1; i <= n; i++) {
                        // for space
                        for (int j = 1; j <= (n - i); j++) {
                                System.out.print(" ");
                        }
                        // for Increasing
                        for (int k = 1; k <= i; k++) {
                                System.out.print(arr[k - 1]);
                        }
                        // for Decreasing
                        for (int l = i - 1; l > 0; l--) {
                                System.out.print(arr[l - 1]);
                        }
                        System.out.println();
                }
                System.out.println("Pattern: 18 -----------------------------");

                for (int i = n; i > 0; i--) {
                        for (int j = i; j <= n; j++) {
                                System.out.print(arr[j - 1]);
                        }
                        System.out.println();
                }
                System.out.println("Pattern: 19 -----------------------------");

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                                System.out.print("*");
                        }
                        for (int k = 0; k < 2 * i; k++) {
                                System.out.print(" ");
                        }
                        for (int l = 0; l < n - i; l++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                        }
                        for (int k = 0; k < 2 * (n - i - 1); k++) {
                                System.out.print(" ");
                        }
                        for (int l = 0; l <= i; l++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
                System.out.println("Pattern: 20 -----------------------------");

                for (int i = 0; i < n; i++) {
                        for (int j = 0; j <= i; j++) {
                                System.out.print("*");
                        }
                        for (int k = 0; k < 2 * (n - i - 1); k++) {
                                System.out.print(" ");
                        }
                        for (int l = 0; l <= i; l++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                for (int i = 1; i < n; i++) {
                        for (int j = 0; j < n - i; j++) {
                                System.out.print("*");
                        }
                        for (int k = 0; k < 2 * i; k++) {
                                System.out.print(" ");
                        }
                        for (int l = 0; l < n - i; l++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 21 -----------------------------");

                for (int i = 1; i <= n; i++) {
                        if (i == 1 || i == n) {
                                for (int j = 1; j <= n; j++) {
                                        System.out.print("*");
                                }
                        } else {
                                System.out.print("*");
                                for (int j = 1; j <= n - 2; j++) {
                                        System.out.print(" ");
                                }
                                System.out.print("*");
                        }
                        System.out.println();
                }

                System.out.println("Pattern: 22 -----------------------------");

                // ArrayList<ArrayList<Integer>> container = new ArrayList<>();
                int[][] container = new int[2 * n - 1][2 * n - 1];
                int e = 0;
                for (int k = n; k > 0; k--) {
                        for (int i = 0; i < 2 * k - 1; i++) {
                                for (int j = 0; j < 2 * k - 1; j++) {
                                        container[i+e][j+e] = k;
                                }
                        }
                        e++;
                }
                //printing
                for (int i = 0; i < container.length; i++) {
                        for (int j = 0; j < container[i].length; j++) {
                                System.out.print(container[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}