package idv.jay.codingInterview.string;

/**
 * leetcode 14
 */
public class LongestCommonPrefix {

  /**
   * 暴力解法(水平)
   *
   * @param strs
   * @return
   */
  public static String longestCommonPrefixHorizontal(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty()) {
          return "";
        }
      }
    }
    return prefix;
  }

  /**
   * 暴力解法(垂直)
   *
   * @param strs
   * @return
   */
  public static String longestCommonPrefixVertical(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  /**
   * Binary search
   * @param strs
   * @return
   */
  public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    int minLen = Integer.MAX_VALUE;
    for (String str : strs) {
      minLen = Math.min(minLen, str.length());
    }
    int low = 1;
    int high = minLen;
    while (low <= high) {
      int middle = (low + high) / 2;
      if (isCommonPrefix(strs, middle)) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }
    return strs[0].substring(0, (low + high) / 2);
  }

  private static boolean isCommonPrefix(String[] strs, int len) {
    String str1 = strs[0].substring(0, len);
    for (int i = 1; i < strs.length; i++) {
      if (!strs[i].startsWith(str1)) {
        return false;
      }
    }
    return true;
  }
}
