package idv.jay.codingInterview.string;

import java.util.*;

/**
 * leetcode 49
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
//          這裡要使用 String.valueOf，不可使用toString()，toString()印出的是記憶體位置
            String key = String.valueOf(current);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        for(List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}
