package idv.jay.codingInterview.array;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotateImageTest {

  @Test
  @DisplayName("測試方法一")
  void testRotateGroupOfFourCells() {
    // Arrange
    int matrix[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int[][] expect = {
        {7,4,1},
        {8,5,2},
        {9,6,3}
    };

    // Ack
    RotateImage.rotateGroupOfFourCells(matrix);

    // Assert
    Assertions.assertAll(() -> {
      for (int i = 0; i < expect.length; i++) {
        Assertions.assertTrue(Arrays.equals(expect[i], matrix[i]));
      }
    });
  }

  @Test
  @DisplayName("測試方法二")
  void testReverseOnDiagonalAndThenReverseLeftToRight() {
    // Arrange
    int matrix[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int[][] expect = {
        {7,4,1},
        {8,5,2},
        {9,6,3}
    };

    // Ack
    RotateImage.reverseOnDiagonalAndThenReverseLeftToRight(matrix);

    // Assert
    Assertions.assertAll(() -> {
      for (int i = 0; i < expect.length; i++) {
        Assertions.assertTrue(Arrays.equals(expect[i], matrix[i]));
      }
    });
  }
}
