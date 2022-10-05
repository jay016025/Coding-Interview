package idv.jay.codingInterview.bitManipulation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

  @Test
  @DisplayName("測試有單一數字")
  void testHaveSingleNumber() {
    // Arrange
    int[] numbers = new int[]{2,2,1};

    // Ack
    int actual = SingleNumber.singleNumber(numbers);

    // Assert
    Assertions.assertEquals(1, actual);
  }

  @Test
  @DisplayName("測試沒有單一數字")
  void testNotHaveSingleNumber() {
    // Arrange
    int[] numbers = new int[]{4,1,2,1,2,4};

    // Ack
    int actual = SingleNumber.singleNumber(numbers);

    // Assert
    Assertions.assertEquals(0 , actual);
  }
}
