package Array;

public class Q11_Find_sum_of_Maximum_sum_subarray {
    public static int findMaxSumSubArray(int[] arr) {
        // Write - Your - Code
        int[] dp = new int[arr.length];
        int result = arr[0];
        dp[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            result = Math.max(result, dp[i]);
        }
        return result;
    }
    //O(N)


    //no extra space
    public static int findMaxSumSubArray_2(int[] arr)
    {
        int result = arr[0];
        int pre = arr[0];
        for(int i = 1; i< arr.length; i++)
        {
            pre = Math.max(arr[i], pre + arr[i]);
            result = Math.max(pre, result);
        }
        return result;
    }
}
