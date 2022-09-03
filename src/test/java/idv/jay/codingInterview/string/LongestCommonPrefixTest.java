package idv.jay.codingInterview.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    @Test
    @DisplayName("測試符合預期使用水平迭代")
    void testExpectEqualseActualByHorizontalScanning() {
        // Arrange
        String[] input = {"flower", "flow", "flight"};
        String expect = "fl";

        // Ack
        String actual = LongestCommonPrefix.
                longestCommonPrefixHorizontal(input);

        // Assert
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("測試符合結果使用垂直迭代")
    void testExpectEqualseActualByVerticalScanning() {
        // Arrange
        String[] input = {"dog", "racecar", "car"};
        String expect = "";

        // Ack
        String actual = LongestCommonPrefix.
                longestCommonPrefixVertical(input);

        // Assert
        Assertions.assertEquals(expect, actual);

    }

    @Test
    @DisplayName("測試符合結果使用binary search")
    void testExpectEqualseActualByBinarySearch() {
        // Arrange
        String[] input = {"flower", "flow", "flight"};
        String expect = "fl";

        // Ack
        String actual = LongestCommonPrefix.longestCommonPrefix(input);

        // Assert
        Assertions.assertEquals(expect, actual);
    }

}
