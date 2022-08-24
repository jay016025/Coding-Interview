package idv.jay.codingInterview.string;

/**
 * leetcode 5
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, max = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= j; i++) {
                if (j - i < 2) dp[i][j] = s.charAt(i) == s.charAt(j);
                else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }

                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }

}
