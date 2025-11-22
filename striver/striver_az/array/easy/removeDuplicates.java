package striver.striver_az.array.easy;
import java.util.Arrays;
public class removeDuplicates {
    public static void main(String[] args) {
        // int[] arr = {1, 1, 2, 3, 3, 4, 5};
        // int[] arr = {1,1,2,2,2,3,3};
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        System.out.println(Arrays.toString(arr));
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void removeDuplicate(int[] arr){
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                swap(arr, i+1, j);
                i++;
                j++;
            }else{
                while (j < arr.length && arr[i] == arr[j]) {
                    j++;
                }
            }
        }
    }
}
