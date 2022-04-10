package Array;

public class Squaring_Sorted_Array {
    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        // TODO: Write your code here
        int l = 0;
        int r = arr.length -1;
        int a = arr.length -1;
        while( l <= r )
        {
            int l_num = arr[l] * arr[l];
            int r_num = arr[r] * arr[r];
            if(l_num < r_num)
            {
                squares[a--] = r_num;
                r--;
            }else
            {
                squares[a--] = l_num;
                l++;
            }
        }
        return squares;
    }
}
