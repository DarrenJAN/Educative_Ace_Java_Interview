package Array;

public class Find_Low_High_Index_inSort_array {
    static int findLowIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
        int l = 0;
        int r = nums.length -1;
        while( l <= r)
        {
            int mid = (r - l) / 2 + l;
            if(nums[mid] >= target)
            {
                r = mid -1;
            }else
            {
                l = mid +1;
            }
        }
        if(nums[l] == target)
            return l;
        else
            return -1;
    }

    static int findHighIndex(int[] nums, int target) {
        // TODO: Write - Your - Code
        int l = 0;
        int r = nums.length -1;
        while( l <= r)
        {
            int mid = (r - l) / 2 + l;
            if(nums[mid] <= target)
            {
                l = mid +1 ;
            }else
            {
                r = mid -1;
            }
        }
        if(nums[r] == target)
            return r;
        else
            return -1;
    }
}
