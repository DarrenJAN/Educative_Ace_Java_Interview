package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static List<List<Integer>> searchTriplets(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        // TODO: Write your code here

        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2; i++)
        {
            if( i != 0  && nums[i] == nums[i-1])
                continue;
            int l = i+1;
            int r = nums.length - 1;
            while( l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    triplets.add(tmp);
                    while(l < r && nums[l] == nums[l +1])
                        l++;
                    while(l < r && nums[r] == nums[r-1])
                        r--;
                    l++;
                    r--;

                }else if(sum < 0)
                {
                    l ++;
                }else
                {
                    r--;
                }
            }
        }
        return triplets;
    }
}
