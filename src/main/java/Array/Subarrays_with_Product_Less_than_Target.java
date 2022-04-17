package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subarrays_with_Product_Less_than_Target {
    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> subarrays = new ArrayList<>();
        // TODO: Write your code here
        int product = 1;
        int l = 0;
        for(int right  = 0; right < arr.length;right++)
        {
            product *= arr[right];
            while( product >= target && l <= right)
            {
                product /= arr[l++];
            }
            List<Integer> tempList = new LinkedList<>();
            for (int i = right; i >= l; i--) {
                tempList.add(0, arr[i]);
                subarrays.add(new ArrayList<>(tempList));
            }
        }
        return subarrays;
    }
}
