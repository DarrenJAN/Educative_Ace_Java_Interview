package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> findPermutations(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // TODO: Write your code here
        List<Integer> path = new ArrayList<>();
        for(int num : nums)
            path.add(num);

        backtrack(nums, 0, result, path);
        return result;
    }

    public static void backtrack(int[] nums, int start, List<List<Integer>> result, List<Integer> path)
    {
        if(start  == nums.length)
            result.add(new ArrayList<>(path));

        for(int i = start; i< nums.length; i++)
        {
            swap(path, i , start);
            backtrack(nums, start +1 , result, path);
            swap(path, i , start);
        }
    }

    public static void swap( List<Integer> path, int i, int j)
    {
        int tmp = path.get(i);
        path.set(i, path.get(j));
        path.set(j, tmp);
    }

}
