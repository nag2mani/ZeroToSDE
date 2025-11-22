package striver.striver_az.array.easy;
public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,4,0};
        int target = 0;
        // System.out.println(linearSearchs(arr, 4));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.err.println(i);
            }
        }
    }
}
