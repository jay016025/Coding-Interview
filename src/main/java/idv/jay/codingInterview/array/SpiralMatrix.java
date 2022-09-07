package idv.jay.codingInterview.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  private SpiralMatrix() {
    throw new IllegalStateException("code sample class");
  }

  /*
    1 2 3 4
    5 6 7 8
    9 10 11 12
   */
  public static List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    // defined the boundaries of the matrix
    int row = matrix.length;
    int column = matrix[0].length;
    int top = 0, bottom = row -1,
        left = 0, right = column -1;

    // iterator the matrix
    while (top <= bottom && left <= right) {
      spiral(result, matrix, top, bottom, left, right);
      top++;
      left++;
      bottom--;
      right--;
    }
    return result;
  }

  public static void spiral(List<Integer> res, int[][] matrix,
      int top, int bottom, int left, int right) {

    if(top == bottom) {
      for (int i = left; i <= right; i++) {
        res.add(matrix[left][i]);
      }
      return;
    }
    if(left == right) {
      for (int i = top; i <= bottom; i++) {
        res.add(matrix[i][top]);
      }
      return;
    }

    for (int i = left; i <= right -1; i++) {
      res.add(matrix[top][i]);
    }
    for (int i = top; i <= bottom - 1; i++) {
      res.add(matrix[i][right]);
    }
    for (int i = right; i >= left + 1; i--) {
      res.add(matrix[bottom][i]);
    }
    for (int i = bottom; i >= top + 1; i--) {
      res.add(matrix[i][left]);
    }
  }
}
