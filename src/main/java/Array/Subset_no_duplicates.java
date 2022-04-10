package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_no_duplicates {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        // TODO: Write your code here
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> subsets )
    {
        subsets.add(new ArrayList<>(path));

        for(int i = start; i < nums.length; i++)
        {
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }

            path.add(nums[i]);
            backtrack(nums, i+1, path, subsets);
            path.remove(path.size()-1);
        }
    }
}
