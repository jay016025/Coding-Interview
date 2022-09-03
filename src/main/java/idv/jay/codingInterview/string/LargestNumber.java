package idv.jay.codingInterview.string;

import java.util.Arrays;

/**
 * leetcode 179
 */
public class LargestNumber {

    public static String largestNumber(int[] nums) {
//      將數字轉為字串
        String[] asString = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asString[i] = String.valueOf(nums[i]);
        }

//      排序此字串，需實作一comparator
        Arrays.sort(asString,
                (a, b) -> (b + a).compareTo(a + b));

//      判斷第一個元素如果是0就直接回傳0
        if ("0".equals(asString[0])) return "0";

//      拼接成最大數字字串回傳
        String res = "";
        for (String item : asString) {
            res += item;
        }

        return res;
    }
}
