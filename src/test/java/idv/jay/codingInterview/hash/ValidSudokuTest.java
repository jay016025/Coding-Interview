package idv.jay.codingInterview.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidSudokuTest {

  @Test
  @DisplayName("測試輸入參數是數獨")
  void testValidIsSudoku() {
    // Arrange
    char[][] inputBoard = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    // Ack
    boolean actual = ValidSudoku.isValidSudoku(inputBoard);

    // Assert
    Assertions.assertTrue(actual);
  }

  @Test
  @DisplayName("測試輸入參數非數獨")
  void testValidNotSudoku() {
    // Arrange
    char[][] inputBoard = {
        {'8','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    // Ack
    boolean actual = ValidSudoku.isValidSudoku(inputBoard);

    // Assert
    Assertions.assertFalse(actual);
  }
}
