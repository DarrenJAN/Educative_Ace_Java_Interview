package Array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> findSubsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        // TODO: Write your code here
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    public static void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> subsets)
    {


        subsets.add(new ArrayList<>(path));

        for(int i = start; i< nums.length;i++)
        {
            path.add(nums[i]);
            backtrack(nums, i +1, path, subsets);
            path.remove(path.size()-1);
        }
    }
}
