public class rotateArrayOne {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
        rotateArrayOnes(arr, 1);
    }
    public static void rotateArrayOnes(int[] arr, int k){
        int n = arr.length;
        for (int i=0; i < arr.length;i++){
            System.err.print(arr[(i+k)%n]);
        }
    }
}