package idv.jay.codingInterview.binarySearch;

public class FirstBadVersion {

    public static int firstBadVersion(int n) {
        int i = 1;
        while (i < n) {
            int mid = (i + n) / 2;
            if(isBadVersion(mid)) n = mid;
            else i = mid + 1;
        }
        return i;
    }

    /*
        隨機回傳版本是否正確
     */
    private static boolean isBadVersion(int version) {
        int num = (int)(Math.random() * 10);
        return num > 5? true : false;
    }
}
