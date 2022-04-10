package Array;

import java.util.HashMap;

public class Q6First_uniqe_Integer_in_an_array {
    public static int findFirstUnique(int[] arr) {
        int result = 0;
        // write your code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(hashMap.get(arr[i]) == 1)
            {
                result = arr[i];
                return result;
            }

        }
        return result;
    }

}
