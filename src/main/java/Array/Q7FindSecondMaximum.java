package Array;

import java.util.Arrays;

public class Q7FindSecondMaximum {
    public int findSecondMaximum(int[] arr)
    {
        // Write - Your - Code
        if(arr.length <= 1){
            return -1;
        }

        Arrays.sort(arr);
        return arr[arr.length-2];


    }
}
