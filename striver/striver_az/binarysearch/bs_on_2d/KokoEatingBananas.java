import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));
    }


    // public static int check_k(int[] piles, int num){
    //     int hours = 0;
    //     int i = 0;
    //     while (i < piles.length) {
    //         if (piles[i] <= num) {
    //             hours++;
    //         } else{
    //             hours = hours + piles[i]/num + 1;
    //         }
    //         i++;
    //     }
    //     return hours;
    // }

    
    // Use long to avoid overflow in hours
    public static long check_k(int[] piles, int num) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + num - 1) / num; // it prevent adding extra hours when divisiion is exact.
        }
        return hours;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        // int summ = Arrays.stream(piles).sum(); it cause overflow.
        int max = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = max;
        int result = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check_k(piles, mid) <= h){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

