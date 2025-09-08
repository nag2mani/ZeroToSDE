public class maxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1,1, 0,1,1,1,1};
        int max=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                count = count +1;
            }else{
                max = (max>count)?max:count;
                count = 0;
            }
        }
        max = (max > count) ? max : count;
        System.err.println(max);
    }
}
