package idv.jay.codingInterview.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstringTest {

    @Test
    @DisplayName("測試符合預期結果1")
    void testExpectedEqualsActual1() {
        // Arrange
        String input = "babad";
        String expect = "bab";

        // ACK
        String actual = LongestPalindromicSubstring.longestPalindrome(input);

        // Assert
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("測試符合預期結果2")
    void testExpectedEqualsActual2() {
        // Arrange
        String input = "cbbd";
        String expect = "bb";

        // ACK
        String actual = LongestPalindromicSubstring.longestPalindrome(input);

        // Assert
        Assertions.assertEquals(expect, actual);
    }
}
