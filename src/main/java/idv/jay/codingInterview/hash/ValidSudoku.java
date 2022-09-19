package idv.jay.codingInterview.hash;

/**
 * leetcode 36
 */
public class ValidSudoku {

  private ValidSudoku() {throw new IllegalStateException("Sample code class");}


  /*
    input board:
    [["5","3",".",".","7",".",".",".","."]
    ,["6",".",".","1","9","5",".",".","."]
    ,[".","9","8",".",".",".",".","6","."]
    ,["8",".",".",".","6",".",".",".","3"]
    ,["4",".",".","8",".","3",".",".","1"]
    ,["7",".",".",".","2",".",".",".","6"]
    ,[".","6",".",".",".",".","2","8","."]
    ,[".",".",".","4","1","9",".",".","5"]
    ,[".",".",".",".","8",".",".","7","9"]]
   */
  public static boolean isValidSudoku(char[][] board) {
    boolean[][] row = new boolean[board.length][board[0].length];
    boolean[][] col = new boolean[board.length][board[0].length];
    boolean[][] cube = new boolean[board.length][board[0].length];

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        char c = board[i][j];
        if (c == '.') continue;
        int k = i / 3 * 3 + j / 3;
        int cIndex = c - '0' - 1;
        if (row[i][cIndex] || col[j][cIndex] || cube[k][cIndex]) return false;
        row[i][cIndex] = true;
        col[j][cIndex] = true;
        cube[k][cIndex] = true;
      }
    }
    return true;
  }
}
