package Array;

import java.util.Arrays;

public class ThreeSum_Close {
    public static int searchTriplet(int[] nums, int targetSum) {
        // TODO: Write your code here
        Arrays.sort(nums);

        int result = Integer.MAX_VALUE;
        int close_target = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length -2 ; i ++)
        {
            int l = i +1;
            int r = nums.length-1;
            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == targetSum)
                    return targetSum;
                else if(sum < targetSum)
                {
                    l++;
                }else
                {
                    r--;
                }
                if(Math.abs(targetSum - sum) < close_target)
                {
                    result = sum;
                    close_target  = Math.abs(targetSum - sum);
                }

            }
        }
        return result;
    }

}
