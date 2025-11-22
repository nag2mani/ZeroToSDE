package striver.striver_az.array.easy;
import java.util.LinkedHashSet;
import java.util.Set;

public class findUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        findUnions(arr1, arr2);
    }

    public static void findUnions(int[] arr1, int[] arr2){
        Set<Integer> set = new LinkedHashSet<>();
        int i =0;
        int j=0;
        int m = arr1.length;
        int n = arr2.length;
        while (i < m || j < n) {
            if (i < m && arr1[i] < arr2[j]) {
                set.add(arr1[i]);
                i++;
            }else{
                set.add(arr2[j]);
                j++;
            }
        }
        System.out.println(set);
    }
}
