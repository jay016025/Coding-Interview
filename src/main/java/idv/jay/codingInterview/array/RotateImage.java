package idv.jay.codingInterview.array;

/**
 * leetcode 48
 */
public class RotateImage {

  /*
    1, 2, 3    7, 4, 1
    4, 5, 6 -> 8, 5, 2
    7, 8, 9`   9, 6, 3
   */
  private RotateImage() {
    throw new IllegalStateException("sample code class");
  }

  public static void rotateGroupOfFourCells(int[][] matrix) {
    int len = matrix.length;

//  指針走斜線
    for (int i = 0; i < len / 2; i++) {
      for (int j = i; j < len - 1 - i; j++) {
        int temp = matrix[i][j];
//      這邊寫法需考慮當前與j++後下一步，會比較好想。
        matrix[i][j] = matrix[len - 1 - j][i];
        matrix[len - 1 - j][i] = matrix[len - 1 - i][len - 1 - j];
        matrix[len - 1 - i][len - 1 - j] = matrix[j][len - 1 - i];
        matrix[j][len - 1 - i] = temp;
      }
    }
  }

  public static void reverseOnDiagonalAndThenReverseLeftToRight(int[][] matrix) {
    transpose(matrix);
    reflect(matrix);
  }

  /*
     斜線旋轉，中心軸: \
   */
  private static void transpose(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int tmp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = tmp;
      }
    }
  }

  /*
    左右旋轉
   */
  private static void reflect(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = tmp;
      }
    }
  }
}
