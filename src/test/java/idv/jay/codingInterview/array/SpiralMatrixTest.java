package idv.jay.codingInterview.array;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

  @Test
  @DisplayName("測試結果符合預期1")
  void testExpectedEqualsActual1() {
    // Arrange
    int[][] input = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    // Actual
    List<Integer> actual = SpiralMatrix.spiralOrder(input);

    // Assert
    List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  @DisplayName("測試結果符合預期2")
  void testExpectedEqualsActual2() {
    // Arrange
    int[][] input = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    // Actual
    List<Integer> actual = SpiralMatrix.spiralOrder(input);

    // Assert
    List<Integer> expected = List.
        of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
    Assertions.assertEquals(expected, actual);
  }
}
