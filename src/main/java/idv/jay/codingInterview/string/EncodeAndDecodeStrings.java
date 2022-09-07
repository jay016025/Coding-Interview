package idv.jay.codingInterview.string;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 271
 */
public class EncodeAndDecodeStrings {

  private EncodeAndDecodeStrings() {
    throw new IllegalStateException("code sample class");
  }

  public static String encode(List<String> strings) {
    StringBuilder encode = new StringBuilder();
    for(String s : strings)
      encode.append(s.length()).append("/").append(s);

    return encode.toString();
  }

  public static List<String> decode(String s) {
    List<String> decode = new ArrayList<>();
    int i = 0;
    while (i < s.length()) {
      int slash = s.indexOf("/", i);
      int length = Integer.parseInt(s.substring(i, slash));
      decode.add(s.substring(slash + 1, slash + length + 1));
      i = slash + 1 + length;
    }
    return decode;
  }
}
