package striver.striver_az.array.easy;
public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {3,66,787,0,-1};

        int[] largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest[0]);

        int seclargest = findSecLargest(arr);
        System.out.println("The second largest element in the array is: " + seclargest);

        int[] smallest = findSmallest(arr);
        System.out.println("The smallest element in the array is: " + smallest[0]);

        int secsmallest = findSecSmallest(arr);
        System.out.println("The second smallest element in the array is: " + secsmallest);
        
        // To findNthLargest function: sort then find
        // Find the nth largest element in the array.
        // @param arr The input array
        // param ne position (1-based, where 1 is the largest)
        // return The nth largest element, or Integer.MIN_VALUE if n is invalid.
    }
    
    public static int[] findLargest(int[] arr) {
        int largest = arr[0];
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                idx = i;
            }
        }
        return new int[] {largest, idx};
    }
    
    public static int findSecLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int[] temp = findLargest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == temp[1]) {continue;}
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static int[] findSmallest(int[] arr) {
        int smallest = arr[0];
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                idx = i;
            }
        }
        return new int[] {smallest, idx};
    }
    
    public static int findSecSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int[] temp = findSmallest(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i == temp[1]) {continue;}
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
