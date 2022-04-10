package Array;

public class Q4Array_product_all_elements {
    public static int[] findProduct(int arr[])
    {
        int [] result = new int[arr.length];
        int total_product = 1;
        int number_zero = 0;
        int zero_index = 0;
        for(int i = 0; i < arr.length; i++)
        {

            if(arr[i] == 0)
            {
                number_zero ++;
                zero_index = i;
            }else
            {
                total_product *= arr[i];
            }
        }

        if(number_zero > 1) {
            return result;
        }

        if(number_zero == 1){
            result[zero_index] = total_product;
            return result;
        }

        for(int i = 0; i < arr.length; i++)
        {
            result[i] = total_product / arr[i];
        }


        return result;
    }

}
