package Array;

public class Smallest_Subarray_With_Greater_Sum {
    public static int findMinSubArray(int S, int[] arr) {
        // TODO: Write your code here
        // TODO: Write your code here
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int l = 0;
        int length = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum+= arr[i];
            length++;

            while(sum >= S)
            {
                result = Math.min(result, length);
                sum -= arr[l++];
                length --;
            }
        }
        return result;
    }
}
