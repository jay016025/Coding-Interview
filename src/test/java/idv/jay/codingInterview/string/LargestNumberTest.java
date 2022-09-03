package idv.jay.codingInterview.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LargestNumberTest {

    @Test
    @DisplayName("測試符合預期結果1")
    void testExpectedEqualsActual1() {
        // Arrange
        int[] input = {10, 2};
        String expected = "210";

        // Ack
        String actual = LargestNumber.largestNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("測試符合預期結果2")
    void testExpectedEqualsActual2() {
        // Arrange
        int[] input = {3, 30, 34, 5, 9};
        String expected = "9534330";

        // Ack
        String actual = LargestNumber.largestNumber(input);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

}
