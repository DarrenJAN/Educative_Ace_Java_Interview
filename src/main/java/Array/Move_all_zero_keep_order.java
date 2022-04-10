package Array;

public class Move_all_zero_keep_order {
    static void moveZerosToLeft(int[] nums) {
        // TODO: Write - Your - Code
        int zero_index = 0;
        int not_zero_index = nums.length -1;
        for(int i = nums.length-1;i>= 0;i--)
        {
            if(nums[i] != 0)
            {
                nums[not_zero_index--] = nums[i];
            }
        }

        for(int i = 0;i <= not_zero_index;i++)
        {
            nums[i] = 0;
        }

    }

    static void swap(int[] nums, int l, int r )
    {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
