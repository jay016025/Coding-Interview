package idv.jay.codingInterview.binarySearch;

/**
 * leetcode 35
 */
public class SearchInsertPosition {

  private SearchInsertPosition() {throw new IllegalStateException("Demo class");}

  public static int searchInsert(int[] nums, int target) {
    int l = 0, r = nums.length -1;
    while (l < r) {
      int mid = (l + r) / 2;
      if(nums[mid] < target) l = mid + 1;
      else r = mid;
    }

    if(nums[l] < target) return l + 1;
    else return l;
  }
}
