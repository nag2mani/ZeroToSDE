import java.util.Arrays;

public class MinNumbeOfDays {
    public static void main(String[] args) {
        MinNumbeOfDays solution = new MinNumbeOfDays();
        // int[] bloomDay = {1, 10, 3, 10, 2};
        int[] bloomDay = {7,7,7,7,12,7,7};
        System.out.println(solution.minDays(bloomDay, 2, 3));
    }

    public boolean canMake(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int num : bloomDay) {
            if (num <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0; // reset because flowers can't be reused
                }
            } else {
                flowers = 0; // break sequence
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length){
            return -1;
        }
        int max = Arrays.stream(bloomDay).max().getAsInt();
        int low = Arrays.stream(bloomDay).min().getAsInt();;
        int high = max;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println("day " + mid + " canmakeflowers " + canMake(bloomDay, mid,m,k));
            if (canMake(bloomDay, mid,m,k)){
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}