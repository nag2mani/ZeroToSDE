public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {3,66,787,0,-1};
        int findSmallest = findSmallest(arr);
        int largest = LargestElement.findLargest(arr);
        System.out.println("The Smallest element in the array is: " + findSmallest);
        System.out.println("The Largest element in the array is: " + largest);
    }

    public static int findSmallest(int[] arr) {

        int findSmallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < findSmallest) {
                findSmallest = arr[i];
            }
        }
        return findSmallest;
    }
}