package striver.striver_az.array.medium;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  if an element is 0, set its entire row and column to 0's. You must do it in place.
public class SetMatrixZero {
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1, 1, 1},
        //     {1, 0, 1},
        //     {1, 1, 1}
        // };
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        Matrixsetzero(matrix);
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }

        System.out.println(Arrays.deepToString(matrix));
    }
    
    public static void Matrixsetzero(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        Set<Integer> rowSet = new HashSet<Integer>();
        Set<Integer> colSet = new HashSet<Integer>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]==0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        // System.out.println("Rows: " + rowSet);
        // System.out.println("Cols: " + colSet);
        
        for (int row : rowSet) {
            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }
        }
        
        for (int col : colSet) {
            for (int i = 0; i < rows; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
