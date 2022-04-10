package Array;

public class Q10RearrangeSortedArrayinMaxMinForm {
    public static void maxMin(int[] arr) {

        // Write - Your - Code
        int[] result = new int[arr.length];
        int l = 0;
        int r = arr.length - 1;
        for(int i = 0; i < arr.length; i++)
        {
            if( i % 2 == 0)
            {
                result[i] = arr[r--];
            }else
            {
                result[i] = arr[l++];
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = result[i];
        }
    }
}
