package idv.jay.codingInterview.bitManipulation;

public class SingleNumber {

  private SingleNumber() {throw new IllegalStateException("Demo class");}

  public static int singleNumber(int[] nums) {
    int single = 0;
    for (int num :
        nums) {
      single ^= num;
    }
    return single;
  }
}
