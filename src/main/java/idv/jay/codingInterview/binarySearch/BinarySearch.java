package idv.jay.codingInterview.binarySearch;

public class BinarySearch {


    public static int search(int[] nums, int target) {

        int l = 0, r = nums.length -1;
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return nums[l] == target ? l : -1;
    }
}
