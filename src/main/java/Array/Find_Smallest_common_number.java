package Array;

public class Find_Smallest_common_number {
    static Integer findLeastCommonNumber(int[] arr1, int[] arr2, int[] arr3) {
        // TODO: Write - Your - Code
        int l1=  0;
        int l2 = 0;
        int l3 = 0;

        while(l1 < arr1.length && l2 < arr2.length && l3 < arr3.length)
        {
            if(arr1[l1] == arr2[l2] && arr2[l2] == arr3[l3])
                return arr1[l1];

            else if(arr1[l1] <= arr2[l2] && arr1[l1] <= arr3[l3])
            {
                l1++;
            }else if(arr2[l2] <= arr1[l1] && arr2[l2] <= arr3[l3])
            {
                l2++;
            }else if(arr3[l3] <= arr2[l2] && arr3[l3] <= arr1[l1]) {
                l3++;
            }
        }
        return -1;
    }
}
