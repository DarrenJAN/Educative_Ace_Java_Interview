package Array;

public class Order_agnostic_Binary_Search {
    public static int search(int[] arr, int key) {
        // TODO: Write your code here
        if(arr[0] <= arr[arr.length-1])
        {
            return search_in_order(arr, key);
        }else
        {
            return search_reverse_order(arr, key);
        }

    }

    public static int search_in_order(int[] arr, int key)
    {
        int l = 0;
        int r = arr.length - 1 ;
        while( l <= r)
        {
            int mid = (r - l) /2 + l;
            if(arr[mid] == key)
            {
                return mid;
            } else if(arr[mid] < key )
            {
                l = mid +1;
            }else
            {
                r = mid -1;
            }
        }
        return -1;
    }

    public static int search_reverse_order(int[] arr, int key)
    {
        int l = 0;
        int r = arr.length - 1 ;
        while( l <= r)
        {
            int mid = (r - l) /2 + l;
            if(arr[mid] == key)
            {
                return mid;
            } else if(arr[mid] > key )
            {
                l = mid +1;
            }else
            {
                r = mid -1;
            }
        }
        return -1;

    }
}
