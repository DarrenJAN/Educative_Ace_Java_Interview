package Array;

public class Q9Rearrage_Postive_negative_values {
    public static void reArrange(int[] arr) {

        //Write - Your - Code
        int negative_index = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] < 0)
            {
                swap(arr, negative_index, i);
                negative_index ++;
            }
        }
    }

    public static void swap(int[] arr, int l, int r)
    {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

}
