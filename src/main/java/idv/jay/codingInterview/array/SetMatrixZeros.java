package idv.jay.codingInterview.array;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

    private SetMatrixZeros() {throw new IllegalStateException("sample code class");}

    /**
     * description: 暴力解，使用額外空間紀錄 0 的行和列
     * @param matrix
     */
    public static void setZeroesByAdditionalMemory(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

//      標記要改為 0 的行和列
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }

            }
        }

//      再次迭代 matrix，這次依照set裡存放的行跟列更新為0
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(rows.contains(i) || cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }

    /**
     * description: O(1) 解法
     * @param matrix
     */
    public static void setZeroByEfficient(int[][] matrix) {

        boolean isCol = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }

            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}