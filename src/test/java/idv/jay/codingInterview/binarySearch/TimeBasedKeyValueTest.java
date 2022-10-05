package idv.jay.codingInterview.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TimeBasedKeyValueTest {

    @Test
    @DisplayName("測試取得時戳鍵值對線性查詢")
    void testTimeMapByLinearSearch() {

        // Arrange
        TimeBasedKeyValue.TimeMapByLinearSearch linearSearch =
                new TimeBasedKeyValue.TimeMapByLinearSearch();

        linearSearch.set("key1", "value1", 1);
        linearSearch.set("key1", "value2", 5);

        // Act
        String value1 = linearSearch.get("key1", 2);
        String value2 = linearSearch.get("key1", 6);

        // Assert
        Assertions.assertAll(() -> {
            Assertions.assertEquals("value1", value1);
            Assertions.assertEquals("value2", value2);
        });
    }

    @Test
    @DisplayName("測試取得時戳鍵值對二元查詢")
    void testTimeMapByBinarySearch() {
        // Arrange
        TimeBasedKeyValue.TimeMapByBinarySearch binarySearch =
                new TimeBasedKeyValue.TimeMapByBinarySearch();

        binarySearch.set("key1", "value1", 1);
        binarySearch.set("key1", "value2", 5);

        // Act
        String value1 = binarySearch.get("key1", 2);
        String value2 = binarySearch.get("key1", 6);

        // Assert
        Assertions.assertAll(() -> {
            Assertions.assertEquals("value1", value1);
            Assertions.assertEquals("value2", value2);
        });
    }
}
