package striver.striver_az.array.hard;

public class MaxSubarrayProduct {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; //960
        // int[] arr = {2,3,-2,4}; //6
        int maxp = maxProduct(arr);
        int maxp2 = maxProduct2(arr);
        System.out.println("Maximum Subarray product: " + maxp); 
        System.out.println("Maximum Subarray product2: " + maxp2); 
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

    public static int maxProduct2(int[] arr) {
    int maxProd = arr[0];
    int minProd = arr[0];
    int ans = arr[0];

    for (int i = 1; i < arr.length; i++) { // can't start from i=0
        int curr = arr[i];

        // If curr is negative, swap maxProd and minProd
        if (curr < 0) {
            int temp = maxProd;
            maxProd = minProd;
            minProd = temp;
        }

        maxProd = Math.max(curr, curr * maxProd);
        minProd = Math.min(curr, curr * minProd);

        ans = Math.max(ans, maxProd);
    }
    return ans;
    }
}
