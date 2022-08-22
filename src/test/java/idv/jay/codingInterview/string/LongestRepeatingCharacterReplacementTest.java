package idv.jay.codingInterview.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    @DisplayName("測試符合預期結果1")
    void testExpectedEqualsActual1() {

        // Arrange
        String s = "ABAB";
        int k = 2;

        // Ack
        int actual = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // Assert
        Assertions.assertEquals(4, actual);
    }

    @Test
    @DisplayName("測試符合預期結果2")
    void testExpectedEqualsActual2() {

        // Arrange
        String s = "AABABBA";
        int k = 1;

        // Ack
        int actual = LongestRepeatingCharacterReplacement.characterReplacement(s, k);

        // Assert
        Assertions.assertEquals(4, actual);
    }
}
