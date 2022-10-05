package idv.jay.codingInterview.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {

    @Test
    @DisplayName("測試目標值在旋轉數組中")
    void testTargetInRotatedArray() {
        // Arrange
        int[] nums = new int[] {4,5,6,7,0,1,2};
        int target = 0;

        // Act
        int actual = SearchInRotatedSortedArray.search(nums, target);

        // Assert
        Assertions.assertEquals(4, actual);
    }

    @Test
    @DisplayName("測試目標值不再旋轉數組中")
    void testTargetNotInRotatedArray() {
        // Arrange
        int[] nums = new int[] {4,5,6,7,0,1,2};
        int target = 3;

        // Act
        int actual = SearchInRotatedSortedArray.search(nums, target);

        // Assert
        Assertions.assertEquals(-1, actual);
    }
}
