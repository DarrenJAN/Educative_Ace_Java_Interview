package Array;

public class Binary_search {
    int BinarySearch(int nums[], int target, int length) {
        //TODO: Write - Your - Code
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
