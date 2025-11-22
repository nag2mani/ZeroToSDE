package striver.striver_az.basic;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 5, 3, 2, 3, 3, 3, 10, 10, 101 };
        countFrequency(arr);
        countFrequencyUsingMap(arr);
        heighestLowestFrequencyElement(arr);
    }

    public static void countFrequency(int arr[]) {
        int n = arr.length;
        int max = 0;
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        int[] freq = new int[max + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        // printitng
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
        // System.out.println(Arrays.toString(freq));
    }

    public static HashMap<Integer, Integer> countFrequencyUsingMap(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        // System.out.println(map);
        // System.out.println(map.get(102));
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        // System.out.println(map.entrySet());

        // for (Integer key : map.keySet()){
        //     System.out.println(key + " " + map.get(key));
        // }
        
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }
        return map;

    }

    public static void heighestLowestFrequencyElement(int arr[]) {
        HashMap<Integer, Integer> freqmap = countFrequencyUsingMap(arr);
        int maxKey = 0;
        int maxValue = 0;
        int minKey = 0;
        int minValue = Integer.MAX_VALUE;
        for (Integer key: freqmap.keySet()){
            if (freqmap.get(key) > maxValue){
                maxKey = key;
                maxValue = freqmap.get(key);
            }
        }
        for (Integer key: freqmap.keySet()){
            if (freqmap.get(key) < minValue){
                minKey = key;
                minValue = freqmap.get(key);
            }
        }
        System.out.println("MaxfreqEle " + maxKey + ", " + "MinfreqEle " + minKey);
    }
}