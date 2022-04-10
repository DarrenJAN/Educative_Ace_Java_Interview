package Array;

public class Q2Merge_Sort {
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        // write your code here
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;
        int result[] = new int[arr1_len + arr2_len];
        int l1 = 0; //l1 pointer
        int l2 = 0; //l2 pointer
        int l3 = 0; //l3 pointer
        while(l1 < arr1_len && l2 < arr2_len)
        {
            if(arr1[l1] <= arr2[l2])
            {
                result[l3++] = arr1[l1++];
            }else
            {
                result[l3++] = arr2[l2++];
            }
        }

        while(l1 < arr1_len)
        {
            result[l3++] = arr1[l1++];
        }

        while(l2 < arr2_len)
        {
            result[l3++] = arr2[l2++];
        }

        return result; // make a new resultant array and return your results in that
    }

    public static void main(String args[]) {

        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {11,19,27};  // creating a sorted array called arr2

        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        for(int i = 0; i < arr1.length + arr2.length; i++) {
            System.out.print(resultantArray[i] + " ");
        }


    }
}
