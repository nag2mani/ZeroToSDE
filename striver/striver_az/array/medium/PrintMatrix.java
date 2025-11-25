package striver.striver_az.array.medium;

// Given an m x n matrix, return all elements of the matrix in spiral order.
public class PrintMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        printSprialMatrix(matrix);
    }

    public static void printSprialMatrix(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while (left <= right && top <= bottom) {

            // Print left to right.(cols change)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i]);
            }
            top++;

            // print top to bottom (row change)
            for (int j = top; j <= bottom; j++) {
                System.out.print(matrix[j][right]);
            }
            right--;

            if (top <= bottom) {
                // print right to left
                for (int k = right; k >= left; k--) {
                    System.out.print(matrix[bottom][k]);
                }
                bottom--;
            }

            if (left <= right) {
                // print bottom to top
                for (int l = bottom; l >= top; l--) {
                    System.out.print(matrix[l][left]);
                }
                left++;
            }
        }
    }
}
