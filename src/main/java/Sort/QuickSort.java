package Sort;

public class QuickSort {
    static void quickSort(int[] nums) {
        // TODO: Write - Your - Code
        quicksorthelper(nums, 0 , nums.length -1);
    }

    static void quicksorthelper(int[] nums, int l, int r)
    {
        if(l < r )
        {
            int pivot_index = partition(nums, l, r);
            //System.out.println(pivot_index);
            quicksorthelper(nums, l, pivot_index-1);
            quicksorthelper(nums, pivot_index+1, r);
        }
    }


    static int partition(int[] nums, int l, int r)
    {
        int pivot = nums[r];
        int index = l;
        for(int i = l;i< r;i++)
        {
            if(nums[i] < pivot)
            {
                swap(nums, index++, i);
            }
        }
        swap(nums, index, r );
        //1 2 4 5 3
        return index;
    }

    static  void swap(int[] nums, int l, int r)
    {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }

    static void  printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int ar [] = {1, 2 , 3 ,4};
        quickSort(ar);
        printArray(ar);
    }
}
