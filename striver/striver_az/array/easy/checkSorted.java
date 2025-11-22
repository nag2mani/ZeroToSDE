package striver.striver_az.array.easy;
public class checkSorted {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,5};
        int[] arr = {5,5, 5, 3, 1, -3, -45};
        System.out.println(checkAscendingOrder(arr) || checkDescendingOrder(arr));
    }

    public static boolean checkAscendingOrder(int[] arr){
        for (int i=1;i < arr.length;i++){
            if (arr[i-1] <= arr[i]){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public static boolean checkDescendingOrder(int[] arr){
        for (int i=1;i < arr.length;i++){
            if (arr[i-1] >= arr[i]){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
}