package idv.jay.codingInterview.string;

/**
 * leetcode 424
 */
public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        int right = 0;
        int left = 0;
        for (int maxCnt = 0; right < s.length(); ++right) {
            char c = s.charAt(right);
            ++counter[c - 'A'];
            maxCnt = Math.max(maxCnt, counter[c - 'A']);
            if (right - left + 1 - maxCnt > k) {
                --counter[s.charAt(left) - 'A'];
                ++left;
            }
        }
        return right - left;
    }
}
