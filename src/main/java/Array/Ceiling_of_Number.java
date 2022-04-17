package Array;

public class Ceiling_of_Number {
    public static int searchCeilingOfANumber(int[] nums, int key) {
        // TODO: Write your code here
        int l = 0;
        int r = nums.length -1;
        if(key > nums[r])
            return -1;
        if(key < nums[l])
            return 0;

        while(l <= r )
        {
            int mid =  (r - l) / 2 + l;
            if(nums[mid] == key)
                return mid;
            else if(nums[mid] < key)
                l  = mid +1;
            else
                r = mid -1;
        }
        return l;
    }

}
