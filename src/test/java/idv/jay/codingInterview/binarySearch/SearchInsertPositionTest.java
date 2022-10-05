package idv.jay.codingInterview.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

  @Test
  @DisplayName("測試目標值再數組中")
  void testTargetInNumbers() {
    // Arrange
    int[] numbers = new int[] {1,3,5,6};
    int target = 5;

    // Ack
    int actual = SearchInsertPosition.searchInsert(numbers, target);

    // Assert
    Assertions.assertEquals(2, actual);
  }

  @Test
  @DisplayName("測試目標值不再數組中")
  void testTargetNotInNumbers() {
    // Arrange
    int[] numbers = new int[]{1,3,5,6};
    int target = 2;

    // Ack
    int actual = SearchInsertPosition.searchInsert(numbers, target);

    // Assert
    Assertions.assertEquals(1, actual);
  }
}
