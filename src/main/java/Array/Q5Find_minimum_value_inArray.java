package Array;

public class Q5Find_minimum_value_inArray {
    public static int findMinimum(int[] arr) {
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < result){
                result = arr[i];
            }
        }
        // Write your code here
        return result;
    }

}
