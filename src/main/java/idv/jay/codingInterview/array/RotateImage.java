package idv.jay.codingInterview.array;

/**
 * leetcode 48
 */
public class RotateImage {

  private RotateImage() {
    throw new IllegalStateException("sample code class");
  }

  public static void rotate_group_of_four_cells(int[][] matrix) {
    int n = matrix.length;
    int rootCount = (n + 1) / 2;
    for (int i = 0; i < rootCount; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[n - 1 - j][i];
        matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
        matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
        matrix[j][n - 1 - i] = matrix[i][j];
        matrix[i][j] = temp;
      }
    }
  }
}
