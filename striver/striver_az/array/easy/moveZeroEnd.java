import java.util.Arrays;

public class moveZeroEnd {
    public static void main(String[] args) {
        // int[] arr = {1,0, 2,0, 0,3,4,5};
        int[] arr = {1,2,0,1,0,4,0};
        System.out.println(Arrays.toString(arr));
        moveZeroEnds(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void moveZeroEnds(int[] arr){
        int i=0;
        int j=0;
        while(j<arr.length && i<arr.length){
            if(arr[i] != 0){
                i++;
    } else{
        j=i+1;
        while (j<arr.length) {
            if (arr[j]==0) {
                j++;
            }else{
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }
}
    }
}
