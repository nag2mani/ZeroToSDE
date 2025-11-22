package striver.striver_az.array.easy;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,66,787,0,-1};
        int largest = findLargest(arr);
        int l_int = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Largest Integer values: " + l_int + ", Largest Long values: " + maxLong);
        System.out.println("The largest element in the array is: " + largest);
        int findSmallest = SmallestElement.findSmallest(arr);
        System.out.println("The Smallest element in the array is: " + findSmallest);
    }
    
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
