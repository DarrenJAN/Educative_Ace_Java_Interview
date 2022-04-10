package Array;

public class Maximum_Sum_Subarray_of_Size_K {
    public static int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int window_sum = 0;
        int result = 0;
        for(int i = 0;i< k; i++)
        {
            window_sum += arr[i];
        }

        result = window_sum;
        for(int i = k; i < arr.length; i++)
        {
            window_sum += arr[i];
            window_sum -= arr[i-k];
            result = Math.max(result, window_sum);
            //System.out.println(window_sum);
        }
        return result;
    }

}
