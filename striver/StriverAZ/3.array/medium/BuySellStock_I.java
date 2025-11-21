public class BuySellStock_I {
    public static void main(String[] args) {
        // int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        System.out.println( "Max Profit " + maximumprofit(prices));
    }

    public static int maximumprofit(int[] arr){
        int maxprofit = 0;
        int minprice = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (arr[i] < minprice){
                minprice = arr[i];
            }
            if ((arr[i] - minprice) > maxprofit){
                maxprofit = arr[i] - minprice;
            }
            i++;
        }
        return maxprofit;
    }
}
