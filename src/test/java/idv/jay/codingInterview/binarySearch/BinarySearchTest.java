package idv.jay.codingInterview.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    @DisplayName("測試二員搜索")
    void testBinarySearch() {
        // Arrange
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        // Act
        int actual = BinarySearch.search(nums, target);

        // Assert
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("測試找不到結果")
    void testBinarySearchNotFund() {
        // Arrange
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        // Act
        int actual = BinarySearch.search(nums, target);

        // Assert
        int expected = -1;
        Assertions.assertEquals(expected, actual);
    }
}
