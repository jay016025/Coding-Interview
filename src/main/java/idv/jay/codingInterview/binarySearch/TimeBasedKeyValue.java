package idv.jay.codingInterview.binarySearch;

import java.util.HashMap;
import java.util.TreeMap;

public class TimeBasedKeyValue {

    public static class TimeMapByLinearSearch {
        private HashMap<String, HashMap<Integer, String>> keyTimeMap;

        public TimeMapByLinearSearch() {
            keyTimeMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {

            if(!keyTimeMap.containsKey(key)) keyTimeMap.put(key, new HashMap<>());

            keyTimeMap.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {

            if(!keyTimeMap.containsKey(key)) return "";

            for (int i = timestamp; i > 0; i--) {
                if(keyTimeMap.get(key).containsKey(i))
                    return keyTimeMap.get(key).get(i);
            }

            return "";

        }
    }

    public static class TimeMapByBinarySearch {
        private HashMap<String, TreeMap<Integer, String>> keyTimeMap;

        public TimeMapByBinarySearch() {
            keyTimeMap = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(!keyTimeMap.containsKey(key)) keyTimeMap.put(key, new TreeMap<>());

            keyTimeMap.get(key).put(timestamp, value);
        }

        public String get(String key, int timestamp) {
            if(!keyTimeMap.containsKey(key)) return "";

            Integer existKey = keyTimeMap.get(key).floorKey(timestamp);

            return existKey == null? "" : keyTimeMap.get(key).get(existKey);

        }
    }
}
