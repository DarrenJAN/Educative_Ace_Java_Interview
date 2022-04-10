package Sort;

public class CyclicSort {
    //sort array from 1 to n
    //https://www.educative.io/module/lesson/data-structures-in-java/gkAq66MrzD3
    public static void sort(int[] nums) {
        // TODO: Write your code here
        int l = 0;
        while(l < nums.length) {
            if (l + 1 == nums[l]) {
                l++;
            } else
            {
                swap(nums, l, nums[l]-1);
            }
        }
    }

    public static void swap(int[] nums, int l , int r)
    {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
