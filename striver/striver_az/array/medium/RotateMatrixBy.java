package striver.striver_az.array.medium;
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise). IN-Place
import java.util.Arrays;
public class RotateMatrixBy {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };
        RotateMatrixByX(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    // public static int[][] RotateMatrixByX(int[][] matrix){
    //     int[][] matrix1={{0,0,0}, {0,0,0}, {0,0,0}};
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             int temp = matrix[i][j];
    //             matrix1[j][matrix.length - 1 - i]= temp;
    //         }
    //     }
    //     return matrix1;
    // }

    public static void RotateMatrixByX(int[][] matrix){
        // Solving Inplace (Transpose the matrix and reverse)

        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) { // this will reverse trangle (not whole)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse
        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}