package Array;

public class Q1Remove_Even_Integer_from_an_array {
    public static int[] removeEven(int[] arr) {

        // Write - Your - Code- Here
        int even_pointer = 0;
        for(int i = 0;i< arr.length; i++)
        {
            if( arr[i] % 2 == 0)
            {
                continue;
            }else
            {
                swap(arr, i, even_pointer);
                even_pointer++;
            }
        }
        int[] result = new int[even_pointer];
        for(int i = 0; i< even_pointer; i++)
        {
            result[i] = arr[i];
        }

        return result; // change this and return the correct result array
    }

    public static void swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
