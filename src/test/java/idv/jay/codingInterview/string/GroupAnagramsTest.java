package idv.jay.codingInterview.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    @DisplayName("測試符合預期結果")
    void testExpectedEqualsActual() {

        // Arrange
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = List.of(
                new ArrayList<>(List.of("bat")),
                new ArrayList<>(List.of("nat", "tan")),
                new ArrayList<>(List.of("ate", "eat", "tea"))
        );

        // Ack
        List<List<String>> actual = GroupAnagrams.groupAnagrams(input);

        // Assert
        for (int i = 0; i < expected.size(); i++) {
            Collections.sort(expected.get(i));
            Collections.sort(actual.get(i));
        }
        Assertions.assertTrue(expected.size() == actual.size());
        org.assertj.core.api.Assertions.assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    @DisplayName("測試輸入只有一個元素")
    void testInputHasOnlyOneElement() {
        // Arrange
        String[] input = {"a"};
        List<List<String>> expected = List.of(
                new ArrayList<>(List.of("a"))
        );

        // Ack
        List<List<String>> actual = GroupAnagrams.groupAnagrams(input);

        // Assert
        for (int i = 0; i < expected.size(); i++) {
            Collections.sort(expected.get(i));
            Collections.sort(actual.get(i));
        }
        Assertions.assertTrue(expected.size() == actual.size());
        org.assertj.core.api.Assertions.assertThat(expected).hasSameElementsAs(actual);
    }

    @Test
    @DisplayName("測試輸入空陣列")
    void testInputEmpty() {
        // Arrange
        String[] input = {};
        List<List<String>> expected = new ArrayList<>();

        // Ack
        List<List<String>> actual = GroupAnagrams.groupAnagrams(input);

        // Assert
        org.assertj.core.api.Assertions.assertThat(expected).hasSameElementsAs(actual);
    }
}
