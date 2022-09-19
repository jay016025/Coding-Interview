package idv.jay.codingInterview.sort;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  @Test
  @DisplayName("測試預期符合結果1")
  void testExpectedEqualsActual1() {
    // Arrange
    int[] input = {10,9, 8, 7, 6, 5, 4, 3, 1, 2};

    // ACK
    BubbleSort.bubbleSort(input);

    // Assert
    Assertions.assertAll(() -> {
      Arrays.stream(input).reduce((pre, curr) -> {
        Assertions.assertTrue(pre <= curr);
        return curr;
      });
    });
  }

  @Test
  @DisplayName("測試預期符合結果2")
  void ExpectedEqualsActual2() {
    // Arrange
    int[] input = {0,8, 9, 9, 6, 4, 3, 7, 1, 2, 11};

    // ACK
    BubbleSort.bubbleSort(input);

    // Assert
    Assertions.assertAll(() -> {
      Arrays.stream(input).reduce((pre, curr) -> {
        Assertions.assertTrue(pre <= curr);
        return curr;
      });
    });
  }
}
