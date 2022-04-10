package Array;

import java.util.HashMap;

public class Q3TwoSum {
    public static int[] findSum(int[] arr, int n)
    {
        int[] result = new int[2];
        // write your code here
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < arr.length; i++)
        {
            int rest = n - arr[i];
            System.out.println(rest);
            if(hashmap.containsKey(rest))
            {
                result[0] = arr[i];
                result[1] = rest;
                return result;
            }else
            {
                hashmap.put(arr[i], i);
            }
        }



        return result;   // return the elements in the array whose sum is equal to the value passed as parameter
    }

}
