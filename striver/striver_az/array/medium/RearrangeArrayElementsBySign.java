package striver.striver_az.array.medium;
import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    // 2149. Rearrange Array Elements by Sign.
    // Note: order in which they were present in nums is preserved and rearranged array begins with a positive integer.
    public static void main(String[] args) {
        // int[] arr = {3,1,-2,-5,2,-4};
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrangeArrayElements(arr)));
    }

    public static int[] rearrangeArrayElements(int[] arr){
        // function is saying is to return array so it's time complexity is O(n) andd space is constant
        int[] ans = new int[arr.length];
        int posIndex = 0; //increment by 2
        int negIndex = 1; //increment by 2
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0){
                ans[posIndex] = arr[i];
                posIndex+=2;
            }else{
                ans[negIndex] = arr[i];
                negIndex+=2;
            }
            i++;
        }
        return ans;
    }
}
