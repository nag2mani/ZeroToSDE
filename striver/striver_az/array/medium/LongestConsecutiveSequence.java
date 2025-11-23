package striver.striver_az.array.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        // int[] arr = {100,4,200,1,3,2};
        System.out.println(LongestConsecutiveSequences(arr));
    }

    public static int LongestConsecutiveSequences(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longeststreak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) { // assume that is start of sequence.
                int startseq = arr[i];
                int currentstreak = 1;
                while (set.contains(startseq+1)) { // This will run only once that's why time complexity is O(n)
                    startseq = startseq + 1;
                    currentstreak = currentstreak+1;
                }
                
                longeststreak = Math.max(longeststreak, currentstreak);
            }
        }
        return longeststreak;
    }


    public static int LongestConsecutiveSequences(int[] arr){
        // leetcode 128 TLE
    }
}