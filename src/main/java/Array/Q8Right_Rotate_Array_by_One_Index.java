package Array;

public class Q8Right_Rotate_Array_by_One_Index {
    public static void rotateArray(int[] arr){

        // Write - Your - Code
        rotateArrayhelper(arr, 1);
    }

    public static  void  rotateArrayhelper(int[] arr, int k)
    {
        revese(arr, 0, arr.length-1);
        revese(arr, 0, k-1);
        revese(arr, k, arr.length-1);
    }

    public static void revese(int[] arr, int l, int r)
    {
        while(l < r)
        {
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }
    // 1 2 3 4 5 6 7    k = 3
    // 5 6 7 1 2 3 4
}
