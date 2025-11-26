package striver.striver_az.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    // Given an integer numRows, return the first numRows of Pascal's triangle.
    // numRows = 5, Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows) );
        System.out.println(clean_generate(numRows) );
    }

    public static List<List<Integer>> generate(int numRows) {
        // List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> res = new ArrayList<>();

        res.add(Arrays.asList(1));
        if (numRows==1) {
            return res;
        }

        res.add(Arrays.asList(1, 1));
        if (numRows==2) {
            return res;
        }

        int i = 2;

        while (i<numRows) {

            List<Integer> curr = new ArrayList<>();

            // add first element
            int f = res.get(i-1).get(0);
            curr.add(f);
            
            // add middle elements
            int j = 1;
            while (j < i) {
                int v = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                curr.add(v);
                j++;
            }

            // add last element
            int l = res.get(i - 1).get(res.get(i - 1).size() - 1);
            curr.add(l);

            i++;
            res.add(curr);
        }

        return res;
    }


    public static List<List<Integer>> clean_generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // First & last element are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements = sum of two from previous row
                    int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(val);
                }
            }

            res.add(row);
        }

        return res;
    }

}
