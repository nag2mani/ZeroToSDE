package striver.striver_az.array.hard;

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxp = maxProduct(arr);
        System.out.println("Maximum Subarray product: " + maxp); 
    }

    public static int maxProduct(int[] arr) {
        int maxprod = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        for (int i=0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++) {
                int prod = 1;
                int len = 0;
                for (int s = i; s < j+1; s++) {
                    prod = prod * arr[s];
                    len = len + 1;
                }
                if (prod > maxprod){
                    maxprod = prod;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        // printArray(arr, startIndex, endIndex);
        return maxprod;
    }


    public static int maxProduct(int[] arr) {
        // Above is TLE
    }
}
