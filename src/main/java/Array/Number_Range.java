package Array;

public class Number_Range {
    public static int[] findRange(int[] arr, int key) {
        int[] result = new int[] { -1, -1 };
        // TODO: Write your code here
        result[0] = find_first(arr, key);
        result[1] = find_last(arr, key);
        if(result[0] > result[1])
            return new int[]{-1, -1 };
        return result;
    }

    public static int find_first(int[] nums, int key)
    {
        int l = 0;
        int r= nums.length-1;
        while(l <= r)
        {
            int mid = (r - l) /2 +l ;
            if(nums[mid] == key )
            {
                r= mid -1;
            }else if(nums[mid] < key)
            {
                l = mid+1;
            }else
            {
                r = mid -1;
            }
        }
        return l;
    }

    public static int find_last(int[] nums, int key)
    {
        int l = 0;
        int r= nums.length-1;
        while(l <= r)
        {
            int mid = (r - l) /2 +l ;
            if(nums[mid] == key )
            {
                l= mid +1;
            }else if(nums[mid] < key)
            {
                l = mid+1;
            }else
            {
                r = mid -1;
            }
        }
        return r;
    }
}

