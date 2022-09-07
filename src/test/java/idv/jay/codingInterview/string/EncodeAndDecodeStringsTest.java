package idv.jay.codingInterview.string;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EncodeAndDecodeStringsTest {

  @Test
  @DisplayName("測試編碼傳入字串集合")
  void testEncodeStrings() {
    // Arrange
    List<String> input = List.of("Hello", "world");

    // Ack
    String actual = EncodeAndDecodeStrings.encode(input);

    // Assert
    Assertions.assertEquals("5/Hello5/world", actual);
  }

  @Test
  @DisplayName("測試解碼字串")
  void testDecodeString() {
    // Arrange
    String string = "5/Hello5/world";
    List<String> expected = List.of("Hello", "world");

    // Ack
    List<String> actual = EncodeAndDecodeStrings.decode(string);

    // Assert
    Assertions.assertEquals(expected, actual);
  }
}
