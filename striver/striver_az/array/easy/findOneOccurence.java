package striver.striver_az.array.easy;
public class findOneOccurence {
    public static void main(String[] args) {
        int[] arr = {1,8,2,3,4,5,1,2,3,4,8,5,767};
        int f = arr[0];
        for (int i = 1; i < arr.length; i++) {
            f = f ^ arr[i];
        }
        System.err.println(f);
    }
}
