import java.util.Arrays;

public class MergeSort {
    //It is recursive funtion (First make two array and put element into it)
    public static void mergeSort(int[] array){
        if (array.length == 1){
            return;
        }
        int middle = array.length / 2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];
        int j=0;
        int k=0;
        for (int i=0;i<array.length;i++){
            if (j < middle){
                leftArray[j] = array[i];
                j++;
            } else{
                rightArray[k] = array[i];
                k++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    
    //It is iterative function (Merge two sorted array into one sorted array)
    public static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l=0, r=0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
                i++;
            } else {
                array[i] = rightArray[r];
                r++;
                i++;
            }
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            r++;
            i++;
        }

        while (l < leftSize) {
            array[i] = leftArray[l];
            l++;
            i++;
        }

    }

    public static void main(String[] args) {
        // Test the merge sort implementation
        int[] arr = { 13, 46, 11, -1, 24, -52, 20, 9, 0, 2, 2 };
        // int[] arr = { 29, 10, 14, 37, 13 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
