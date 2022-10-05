package idv.jay.codingInterview.binarySearch;

/*
    leetcode 33
 */
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int peak = findPeakIndex(nums);
        boolean inRight = target <= nums[peak];
        if(inRight) {
            return binarySearch(nums, peak + 1, nums.length -1, target);
        }else {
            return binarySearch(nums, 0, peak, target);
        }
    }

    private static int findPeakIndex(int[] nums) {
        if(nums.length < 2) return 0;
        if(nums[0] < nums[nums.length - 1]) return nums.length - 1;

        int l = 0, r = nums.length - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] > nums[mid + 1]) return mid;
            else if (nums[l] < nums[mid]) l = mid;
            else r = mid - 1;
        }

        return -1;
    }

    private static int binarySearch(int[] nums, int l, int r, int target) {
        while (l < r) {
            int mid = (l + r) / 2;
            if(nums[mid] < target) l = mid + 1;
            else r = mid;
        }

        return nums[l] == target ? l : -1;
    }
}
