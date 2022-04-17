package Array;

import java.util.Arrays;

public class Triplets_with_Smaller_Sum {
    public static int searchTriplets(int[] nums, int target) {
        int count = 0;
        // TODO: Write your code here
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-2;i++)
        {
            int l = i+1;
            int r = nums.length-1;
            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < target)
                {
                    count += ( r - l);
                    l ++;
                }else
                {
                    r --;
                }
            }
        }
        return count;
    }

}
